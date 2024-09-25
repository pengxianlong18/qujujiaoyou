package cn.codefit.quju.system.service.biz.export;

import cn.codefit.base.qiniu.util.QiNiuUtils;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.exception.QujuException;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.BasOrderDto;
import cn.codefit.quju.system.service.biz.export.data.ExcelDataService;
import cn.codefit.quju.system.service.biz.export.style.MyRowWriteHandler;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.exceptions.ExceptionUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class EasyExcelServiceBizImpl implements EasyExcelBizService {

    /**
     * 上传文件临时存储路径
     */
    @Value("${qiniu.uploadPath}")
    private String exportFilePath;
    /**
     * 导出时默认分页查询每页行数
     */
    @Value("${qiniu.downloda.pagesize}")
    private Integer pageSize = 1000;

    /**
     * 存储上传服务
     */
    @Autowired
    private QiNiuUtils qiNiuUtils;

    /**
     * 公共导出excel方法(同步)
     *
     * @param fileName   导出文件名称
     * @param queryParam 导出数据查询入参
     * @param classz     excel导出对象类
     * @param service
     * @param <T>        查询条件类
     * @param <U>        导出后需要转换为的类
     * @return
     */
    @Override
    public <T, U> CommonResponse<String> exportExcel(String fileName, T queryParam,
                                                     Class<U> classz,
                                                     ExcelDataService<T> service) {
        // 1、文件完整名称
        fileName = fileName + ".xlsx";
        String sheetName = "sheet1";
        // 2、全路径
        String fullPath = exportFilePath + fileName;

        ExcelWriter excelWriter = null;

        String downloadLink = "";

        try {
            int pageNo = 1;
            // 3、创建excelWriter对象
            excelWriter = EasyExcel.write(fullPath, classz)
                    .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).build();
            // todo 使用自定义策略
            // excelWriter = EasyExcel.write(fullPath, classz).registerWriteHandler(new
            // MyCellStyleStrategy()).build();
            // 获取WriteSheet及列配置信息
            WriteSheet writeSheet = null;

            // 分页获取数据
            while (true) {
                // 分页获取查询数据
                PageInfo pageInfo = service.exportExcel(queryParam, pageNo, pageSize);
                // 判断查询数据是否异常
                if (pageInfo == null) {
                    throw new QujuException(ResponseCode.ERPORT_ERROR);
                }
                // 要导出的数据项
                List dataList = pageInfo.getList();
                // 转换为要导出的数据内容
                List exportDataList = BeanUtil.copyToList(dataList, classz);
                // 设置sheet页
                if (writeSheet == null) {
                    // 第一个sheet页
                    writeSheet = EasyExcel.writerSheet(sheetName).sheetNo(0).build();
                    writeSheet.setClazz(classz);
                }
                // 向excel中写入excel
                excelWriter.write(exportDataList, writeSheet);
                // 如果没有数据或者是最后一页则结束导出，否则查询下一页数据
                if (exportDataList.size() < pageSize) {
                    break;
                }
                pageNo++;
            }
            // 导出数据接收后关闭io流
            excelWriter.finish();
            excelWriter = null;
            // 上传文件到存储服务器,并返回前端下载链接
            downloadLink = qiNiuUtils.uploadFile(fullPath, fileName);
        } catch (Exception exception) {
            log.error("执行导出发生异常,msg={}.", ExceptionUtil.getMessage(exception));
        } finally {
            // 无论是否异常一定要关闭io流，防止内存溢出
            if (excelWriter != null) {
                excelWriter.finish();
            }
            // 最终删除创建的临时文件
            File exportFile = new File(fullPath);
            if (exportFile != null && exportFile.exists()) {
                // exportFile.delete();
            }
        }
        return CommonResponse.success(downloadLink);
    }

    /**
     * 复杂excel导出(同步)
     *
     * @param fileName   导出文件名称
     * @param queryParam 导出数据查询入参
     * @param classz     excel导出对象类
     * @param service
     * @param <T>        查询条件类
     * @param <U>        导出后需要转换为的类
     * @return
     */
    @Override
    public <T, U> CommonResponse<String> exportComplexExcel(String fileName, T queryParam, Class<U> classz,
                                                            ExcelDataService<T> service) {
        // 1、文件完整名称
        fileName = fileName + ".xlsx";
        String sheetName = "订单明细";
        // 2、全路径
        String fullPath = exportFilePath + fileName;

        ExcelWriter excelWriter = null;

        String downloadLink = "";

        try {
            int pageNo = 1;
            // 3、创建excelWriter对象
            excelWriter = EasyExcel.write(fullPath, classz)
                    .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).build();
            // 获取WriteSheet及列配置信息
            WriteSheet writeSheet = null;

            // 构建订单报表-sheet页1
            buildStatement(excelWriter);

            // 分页获取数据
            while (true) {
                // 分页获取查询数据
                PageInfo pageInfo = service.exportExcel(queryParam, pageNo, pageSize);
                // 判断查询数据是否异常
                if (pageInfo == null) {
                    throw new QujuException(ResponseCode.ERPORT_ERROR);
                }
                // 要导出的数据项
                List dataList = pageInfo.getList();
                // 转换为要导出的数据内容
                List exportDataList = BeanUtil.copyToList(dataList, classz);
                // 设置sheet页
                if (writeSheet == null) {
                    // 第一个sheet页
                    writeSheet = EasyExcel.writerSheet(sheetName).sheetNo(2).build();
                    writeSheet.setClazz(classz);
                }
                // 向excel中写入excel
                excelWriter.write(exportDataList, writeSheet);
                // 如果没有数据或者是最后一页则结束导出，否则查询下一页数据
                if (exportDataList.size() < pageSize) {
                    break;
                }
                pageNo++;
            }
            // 导出数据接收后关闭io流
            excelWriter.finish();
            excelWriter = null;
            // ZipUtil.zip()
            // 上传文件到存储服务器,并返回前端下载链接
            downloadLink = qiNiuUtils.uploadFile(fullPath, fileName);
        } catch (Exception exception) {
            log.error("执行导出发生异常,msg={}.", ExceptionUtil.getMessage(exception));
        } finally {
            // 无论是否异常一定要关闭io流，防止内存溢出
            if (excelWriter != null) {
                excelWriter.finish();
            }
            // 最终删除创建的临时文件
            File exportFile = new File(fullPath);
            if (exportFile != null && exportFile.exists()) {
                // exportFile.delete();
            }
        }
        return CommonResponse.success(downloadLink);
    }

    /**
     * 构建订单报表-sheet页0
     *
     * @param excelWriter
     */
    private void buildStatement(ExcelWriter excelWriter) {
        BasOrderDto basOrderDto = new BasOrderDto();
        basOrderDto.setCreateTime(new Date());

        // 写入sheet
        WriteSheet writeSheet1 = EasyExcel.writerSheet(1, "订单统计信息")
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .registerWriteHandler(new MyRowWriteHandler())
                .head(createBasOrderHeader(basOrderDto)).build();
        excelWriter.write(new ArrayList<>(), writeSheet1);
    }

    /**
     * 构建导出订单头数据
     *
     * @return
     */
    public static List<List<String>> createBasOrderHeader(BasOrderDto basOrderDto) {
        // 第一行
        String firstHeader = "趣聚订单导出报表";
        // 时间范围
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String timeInterval = String.format("%s-%s", format.format(basOrderDto.getCreateTime()),
                format.format(basOrderDto.getCreateTime()));
        List<List<String>> list = new ArrayList<>();
        List<String> head0 = new ArrayList<>();
        head0.add(firstHeader);
        head0.add("总笔数");
        head0.add("未支付数量");
        head0.add("已支付数量");
        head0.add("支付总金额");
        head0.add("时间区间");
        List<String> head1 = new ArrayList<>();
        head1.add(firstHeader);
        head1.add("2");// 总笔数
        head1.add("3");// 未支付数量
        head1.add("4");// 已支付数量
        head1.add("5");// 支付总金额
        head1.add(timeInterval);// 时间区间

        list.add(head0);
        list.add(head1);
        return list;
    }
}
