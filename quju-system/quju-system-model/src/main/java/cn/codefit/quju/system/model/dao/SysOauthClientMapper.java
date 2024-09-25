package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.SysOauthClient;
import cn.codefit.quju.system.model.po.SysOauthClientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysOauthClientMapper {
    long countByExample(SysOauthClientExample example);

    int deleteByExample(SysOauthClientExample example);

    int deleteByPrimaryKey(String clientId);

    int insert(SysOauthClient record);

    int insertSelective(SysOauthClient record);

    List<SysOauthClient> selectByExample(SysOauthClientExample example);

    SysOauthClient selectByPrimaryKey(String clientId);

    int updateByExampleSelective(@Param("record") SysOauthClient record, @Param("example") SysOauthClientExample example);

    int updateByExample(@Param("record") SysOauthClient record, @Param("example") SysOauthClientExample example);

    int updateByPrimaryKeySelective(SysOauthClient record);

    int updateByPrimaryKey(SysOauthClient record);
}
