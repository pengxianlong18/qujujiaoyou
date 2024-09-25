package cn.codefit.quju.system.service.biz;


import cn.codefit.quju.system.model.po.SysDictionary;

/**
 *
 */
public interface SysDictionaryBizService {

    /**
     * 根据数据字典编码查询数据字典
     *
     * @param dictCode
     * @return
     */
    SysDictionary selectSysDictBydictCode(String dictCode);

    /**
     * 根据id查询数据字典
     *
     * @param id
     * @return
     */
    SysDictionary selectSysDictById(Long id);

    /**
     * 更新数据字典
     *
     * @param sysDictionary
     */
    void updateSysDict(SysDictionary sysDictionary);

    /**
     * 根据字典编码删除数据字典
     *
     * @param dictCode
     */
    void deleteSysDictBydictCode(String dictCode);

    /**
     * 校验字典编码是否可用
     *
     * @param dictCode 字典编码
     * @param dictId   字典id
     * @return
     */
    boolean checkDictByCode(String dictCode, Long dictId);
}
