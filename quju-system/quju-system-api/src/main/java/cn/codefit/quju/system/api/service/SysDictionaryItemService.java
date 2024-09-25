package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysDictionaryItemDto;
import cn.codefit.quju.system.api.vo.SysDictionaryItemVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 业务字典子项接口
 */
public interface SysDictionaryItemService {

    /**
     * 数据字典子项列表分页查询
     * 一般数据字典编码不能为空
     *
     * @return
     */
    CommonResponse<PageInfo<SysDictionaryItemDto>> querySysDictItemList(SysDictionaryItemVo param);

    /**
     * 数据字典子项列表查询
     * 一般数据字典编码不能为空
     *
     * @return
     */
    CommonResponse<List<SysDictionaryItemDto>> querySysDictItemListNoPage(SysDictionaryItemVo param);

    /**
     * 根据id查询数据字典子项最新详情
     *
     * @param id
     * @return
     */
    CommonResponse<SysDictionaryItemDto> querySysDictItemById(Long id);

    /**
     * 新增或修改数据字典子项
     *
     * @param param
     * @return
     */
    CommonResponse<Boolean> addOrUpdateSysDictItem(SysDictionaryItemVo param);

    /**
     * 删除数据字典子项
     *
     * @param id
     * @return
     */
    CommonResponse<Boolean> deleteSysDictItemById(Long id);


}
