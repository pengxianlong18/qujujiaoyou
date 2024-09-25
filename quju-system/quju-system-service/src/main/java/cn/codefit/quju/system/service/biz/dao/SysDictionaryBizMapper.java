package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.SysDictionaryDto;

import java.util.List;
import java.util.Map;

public interface SysDictionaryBizMapper {

    /**
     * 数据字典分列表分页查询
     *
     * @return
     */
    List<SysDictionaryDto> selectByCondition(Map<String, Object> map);

    /**
     * 校验字典编码是否可用
     *
     * @param map
     * @return
     */
    int checkDictByCode(Map<String, Object> map);
}
