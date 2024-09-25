package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.SysDictionaryItem;
import cn.codefit.quju.system.model.po.SysDictionaryItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDictionaryItemMapper {
    long countByExample(SysDictionaryItemExample example);

    int deleteByExample(SysDictionaryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDictionaryItem record);

    int insertSelective(SysDictionaryItem record);

    List<SysDictionaryItem> selectByExample(SysDictionaryItemExample example);

    SysDictionaryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDictionaryItem record, @Param("example") SysDictionaryItemExample example);

    int updateByExample(@Param("record") SysDictionaryItem record, @Param("example") SysDictionaryItemExample example);

    int updateByPrimaryKeySelective(SysDictionaryItem record);

    int updateByPrimaryKey(SysDictionaryItem record);
}
