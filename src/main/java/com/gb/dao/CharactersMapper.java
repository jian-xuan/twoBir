package com.gb.dao;

import com.gb.bean.Characters;
import com.gb.bean.CharactersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharactersMapper {
    long countByExample(CharactersExample example);

    int deleteByExample(CharactersExample example);

    int deleteByPrimaryKey(Integer chId);

    int insert(Characters record);

    int insertSelective(Characters record);

    List<Characters> selectByExample(CharactersExample example);

    List<Characters> selectByToday(String chBirthday);

    Characters selectByPrimaryKey(Integer chId);

    int updateByExampleSelective(@Param("record") Characters record, @Param("example") CharactersExample example);

    int updateByExample(@Param("record") Characters record, @Param("example") CharactersExample example);

    int updateByPrimaryKeySelective(Characters record);

    int updateByPrimaryKey(Characters record);
}