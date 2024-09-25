package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.BasActivity;
import cn.codefit.quju.system.model.po.BasActivityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasActivityMapper {
    long countByExample(BasActivityExample example);

    int deleteByExample(BasActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasActivity record);

    int insertSelective(BasActivity record);

    List<BasActivity> selectByExample(BasActivityExample example);

    BasActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasActivity record, @Param("example") BasActivityExample example);

    int updateByExample(@Param("record") BasActivity record, @Param("example") BasActivityExample example);

    int updateByPrimaryKeySelective(BasActivity record);

    int updateByPrimaryKey(BasActivity record);
}
