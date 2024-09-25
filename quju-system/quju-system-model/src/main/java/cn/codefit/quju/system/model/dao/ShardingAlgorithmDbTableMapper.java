package cn.codefit.quju.system.model.dao;

import cn.codefit.quju.system.model.po.ShardingAlgorithmDbTable;
import cn.codefit.quju.system.model.po.ShardingAlgorithmDbTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShardingAlgorithmDbTableMapper {
    long countByExample(ShardingAlgorithmDbTableExample example);

    int deleteByExample(ShardingAlgorithmDbTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShardingAlgorithmDbTable record);

    int insertSelective(ShardingAlgorithmDbTable record);

    List<ShardingAlgorithmDbTable> selectByExample(ShardingAlgorithmDbTableExample example);

    ShardingAlgorithmDbTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShardingAlgorithmDbTable record, @Param("example") ShardingAlgorithmDbTableExample example);

    int updateByExample(@Param("record") ShardingAlgorithmDbTable record, @Param("example") ShardingAlgorithmDbTableExample example);

    int updateByPrimaryKeySelective(ShardingAlgorithmDbTable record);

    int updateByPrimaryKey(ShardingAlgorithmDbTable record);
}
