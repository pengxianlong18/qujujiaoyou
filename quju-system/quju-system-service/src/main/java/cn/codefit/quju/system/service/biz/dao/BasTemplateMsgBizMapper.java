package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.BasTemplateMsgDto;

import java.util.List;
import java.util.Map;

public interface BasTemplateMsgBizMapper {

    List<BasTemplateMsgDto> selectByMap(Map<String, Object> map);


}
