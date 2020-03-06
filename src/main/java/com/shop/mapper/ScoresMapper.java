package com.shop.mapper;

import com.shop.po.Scores;
import com.shop.po.ScoresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoresMapper {
    long countByExample(ScoresExample example);

    int deleteByExample(ScoresExample example);

    int insert(Scores record);

    int insertSelective(Scores record);

    List<Scores> selectByExample(ScoresExample example);

    int updateByExampleSelective(@Param("record") Scores record, @Param("example") ScoresExample example);

    int updateByExample(@Param("record") Scores record, @Param("example") ScoresExample example);
}