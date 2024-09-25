package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.SysOauthClientDto;

import java.util.List;
import java.util.Map;

public interface SysOauthClientBizMapper {

    List<SysOauthClientDto> selectByCondition(Map<String, Object> map);

}
