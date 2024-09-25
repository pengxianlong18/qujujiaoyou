package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.AppletUser;
import cn.codefit.quju.system.model.po.AppletUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppletUserMapper {
    long countByExample(AppletUserExample example);

    int deleteByExample(AppletUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppletUser record);

    int insertSelective(AppletUser record);

    List<AppletUser> selectByExample(AppletUserExample example);

    AppletUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppletUser record, @Param("example") AppletUserExample example);

    int updateByExample(@Param("record") AppletUser record, @Param("example") AppletUserExample example);

    int updateByPrimaryKeySelective(AppletUser record);

    int updateByPrimaryKey(AppletUser record);
}
