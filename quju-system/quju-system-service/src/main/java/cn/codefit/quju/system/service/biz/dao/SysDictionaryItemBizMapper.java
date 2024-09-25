package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.SysDictionaryItemDto;

import java.util.List;
import java.util.Map;

public interface SysDictionaryItemBizMapper {

    /**
     * 数据字典子项列表分页查询
     * 一般数据字典编码不能为空
     *
     * @return
     */
    List<SysDictionaryItemDto> selectByCondition(Map<String, Object> map);


    void checkSysDictItemDefault(Map<String, Object> map);

    /**
     * 校验字典子项编码是否可用
     *
     * @param map
     * @return
     */
    int checkDictItemByCode(Map<String, Object> map);
}
