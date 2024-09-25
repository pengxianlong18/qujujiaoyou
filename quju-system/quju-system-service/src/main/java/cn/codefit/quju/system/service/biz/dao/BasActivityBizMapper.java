package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.BasActivityDto;

import java.util.List;
import java.util.Map;

public interface BasActivityBizMapper {

    List<BasActivityDto> selectByCondition(Map<String, Object> map);


}
