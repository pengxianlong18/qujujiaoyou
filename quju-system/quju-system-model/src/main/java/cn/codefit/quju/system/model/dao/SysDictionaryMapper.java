package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.SysDictionary;
import cn.codefit.quju.system.model.po.SysDictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDictionaryMapper {
    long countByExample(SysDictionaryExample example);

    int deleteByExample(SysDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDictionary record);

    int insertSelective(SysDictionary record);

    List<SysDictionary> selectByExample(SysDictionaryExample example);

    SysDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByExample(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByPrimaryKeySelective(SysDictionary record);

    int updateByPrimaryKey(SysDictionary record);
}
