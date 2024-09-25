package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysDictionaryDto;
import cn.codefit.quju.system.api.vo.SysDictionaryVo;

/**
 * 数据字典接口
 */
public interface SysDictionaryService {

    /**
     * 数据字典分页表分页查询
     *
     * @return
     */
    CommonResponse querySysDictionaryList(SysDictionaryVo param);

    /**
     * 根据id查询数据字典最新详情
     *
     * @param id
     * @return
     */
    CommonResponse<SysDictionaryDto> querySysDictDetailById(Long id);

    /**
     * 新增或修改数据字典
     *
     * @param param
     * @return
     */
    CommonResponse<Boolean> addOrUpdateSysDict(SysDictionaryVo param);


    /**
     * 删除数据字典
     *
     * @param id
     * @return
     */
    CommonResponse<Boolean> deleteSysDictById(Long id);


}
