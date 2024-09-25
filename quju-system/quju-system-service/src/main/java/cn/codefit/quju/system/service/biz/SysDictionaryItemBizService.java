package cn.codefit.quju.system.service.biz;


import cn.codefit.quju.system.model.po.SysDictionaryItem;

/**
 *
 */
public interface SysDictionaryItemBizService {

    /**
     * 根据数据字典编码更新字典子项
     *
     * @param sysDictionaryItem
     * @param dictCode
     */
    void updateSysDictItemByDictCode(SysDictionaryItem sysDictionaryItem, String dictCode);

    /**
     * 根据数据字典编码删除所有子项数据
     *
     * @param dictCode
     */
    void deleteSysDictItemBydictCode(String dictCode);

    /**
     * 根据id查询数据字典子项最新详情
     *
     * @param id
     * @return
     */
    SysDictionaryItem selectSysDictItemById(Long id);

    /**
     * 根据字典字典编码查询字典子项信息
     *
     * @param itemCode
     * @return
     */
    SysDictionaryItem selectSysDictItemByItemCode(String itemCode);

    /**
     * 更新数据字典子项
     *
     * @param sysDictionaryItem
     */
    void updateSysDictItemById(SysDictionaryItem sysDictionaryItem);

    /**
     * 根据主键删除数据字典子项
     *
     * @param id
     */
    void deleteSysDictItemById(Long id);

    /**
     * 校验子项只存在唯一默认值
     *
     * @param dictCode 字典编码
     * @param id       子项主键
     */
    void checkSysDictItemDefault(String dictCode, Long id);

    /**
     * 校验字典子项编码是否可用
     *
     * @param itemCode
     * @param itemId   子项主键
     * @return
     */
    boolean checkDictItemByCode(String itemCode, Long itemId);
}
