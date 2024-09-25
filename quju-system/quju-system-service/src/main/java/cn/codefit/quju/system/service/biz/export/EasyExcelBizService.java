package cn.codefit.quju.system.service.biz.export;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.service.biz.export.data.ExcelDataService;

public interface EasyExcelBizService {

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
    <T, U> CommonResponse<String> exportExcel(String fileName,
                                              T queryParam,
                                              Class<U> classz,
                                              ExcelDataService<T> service);

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
    <T, U> CommonResponse<String> exportComplexExcel(String fileName, T queryParam, Class<U> classz, ExcelDataService<T> service);

}
