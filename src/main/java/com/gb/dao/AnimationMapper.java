package com.gb.dao;

import com.gb.bean.Animation;
import com.gb.bean.AnimationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimationMapper {
    long countByExample(AnimationExample example);

    int deleteByExample(AnimationExample example);

    int deleteByPrimaryKey(Integer aniId);

    int insert(Animation record);

    int insertSelective(Animation record);

    List<Animation> selectByExample(AnimationExample example);



    Animation selectByPrimaryKey(Integer aniId);

    int updateByExampleSelective(@Param("record") Animation record, @Param("example") AnimationExample example);

    int updateByExample(@Param("record") Animation record, @Param("example") AnimationExample example);

    int updateByPrimaryKeySelective(Animation record);

    int updateByPrimaryKey(Animation record);
}