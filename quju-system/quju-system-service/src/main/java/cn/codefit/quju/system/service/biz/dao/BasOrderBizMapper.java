package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.BasOrderDto;

import java.util.List;
import java.util.Map;

public interface BasOrderBizMapper {

    List<BasOrderDto> selectByCondition(Map<String, Object> map);


}
