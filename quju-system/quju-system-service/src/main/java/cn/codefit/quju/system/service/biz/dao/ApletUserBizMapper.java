package cn.codefit.quju.system.service.biz.dao;

import cn.codefit.quju.system.api.dto.AppletUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ApletUserBizMapper {

    List<AppletUserDto> selectByExample(Map<String, Object> map);

    /**
     * 查询用户昵称
     *
     * @param gzhOpenId 用户-服务号-openid
     * @return
     */
    String selectNickName(@Param("gzhOpenId") String gzhOpenId);
}
