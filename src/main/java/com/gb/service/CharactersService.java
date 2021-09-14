package com.gb.service;


import com.gb.bean.Animation;
import com.gb.bean.Characters;
import com.gb.bean.CharactersExample;
import com.gb.dao.AnimationMapper;
import com.gb.dao.CharactersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharactersService {

    @Autowired
    CharactersMapper charactersMapper;

    /**
     * 查询所有员工
     * @return
     */
    public List<Characters> getAll(){
        return charactersMapper.selectByExample(null);
    }


    /**
     * 员工保存
     * @param characters
     */
    public void saveCharacters(Characters characters){
        charactersMapper.insertSelective(characters);
    }

    /**
     * 检验用户名是否可用
     * @param chName
     * @return
     */
    public boolean checkName(String chName){
        CharactersExample example = new CharactersExample();
        CharactersExample.Criteria criteria = example.createCriteria();
        criteria.andChNameEqualTo(chName);
        long count = charactersMapper.countByExample(example);
        return count==0;
    }


    //查询
    public Characters getCh(Integer id) {
        Characters characters = charactersMapper.selectByPrimaryKey(id);
        return characters;
    }


    //更新
    public void updateCh(Characters characters) {
        charactersMapper.updateByPrimaryKey(characters);

    }

    //单个删除
    public void deleteCh(Integer id) {
        charactersMapper.deleteByPrimaryKey(id);
    }

    //批量删除
    public void deleteBatch(ArrayList<Integer> del_ids) {
        CharactersExample example = new CharactersExample();
        CharactersExample.Criteria criteria = example.createCriteria();
        criteria.andChIdIn(del_ids);
        charactersMapper.deleteByExample(example);
    }


    public List<Characters> getBir(String str) {
        List<Characters> list = charactersMapper.selectByToday(str);
        return  list;
    }

    public List<Characters> getSelect(String str) {
        CharactersExample example = new CharactersExample();
        CharactersExample.Criteria criteria = example.createCriteria();
        criteria.andChNameLike(str);
        CharactersExample example2 = new CharactersExample();
        CharactersExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andChAniLike(str);
        CharactersExample example3 = new CharactersExample();
        CharactersExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andChBackLike(str);
        List<Characters> list = charactersMapper.selectByExample(example);
        List<Characters> list1 = charactersMapper.selectByExample(example2);
        List<Characters> list2 = charactersMapper.selectByExample(example3);
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}
