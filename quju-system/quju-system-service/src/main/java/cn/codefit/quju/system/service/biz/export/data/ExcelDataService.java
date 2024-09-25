package cn.codefit.quju.system.service.biz.export.data;


import com.github.pagehelper.PageInfo;

/**
 * 函数式接口
 * 公共查询导出数据接口
 *
 * @param <T>
 */
@FunctionalInterface
public interface ExcelDataService<T> {
    /**
     * 导出excel的方法
     *
     * @param queryParam 导出数据查询入参
     * @param pageNo     页码
     * @param pageSize   每页查询数量
     * @return
     */
    PageInfo exportExcel(T queryParam, Integer pageNo, Integer pageSize);
}
