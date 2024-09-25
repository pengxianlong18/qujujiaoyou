package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.BasOrder;
import cn.codefit.quju.system.model.po.BasOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasOrderMapper {
    long countByExample(BasOrderExample example);

    int deleteByExample(BasOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasOrder record);

    int insertSelective(BasOrder record);

    List<BasOrder> selectByExample(BasOrderExample example);

    BasOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasOrder record, @Param("example") BasOrderExample example);

    int updateByExample(@Param("record") BasOrder record, @Param("example") BasOrderExample example);

    int updateByPrimaryKeySelective(BasOrder record);

    int updateByPrimaryKey(BasOrder record);
}
