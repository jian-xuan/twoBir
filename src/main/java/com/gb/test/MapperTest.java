package com.gb.test;


import com.gb.bean.Animation;
import com.gb.bean.Characters;
import com.gb.dao.AnimationMapper;
import com.gb.dao.CharactersMapper;
import com.gb.service.CharactersService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * 测试dao层的工作
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration 指定Spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    AnimationMapper animationMapper;
    @Autowired
    CharactersMapper charactersMapper;
    @Autowired
    SqlSession sqlSession;

    //测试animationMapper
    @Test
    public void testCRUD(){
    //1 插入几个动画
     //   System.out.println(animationMapper);
      //animationMapper.insertSelective(new Animation(null,"白沙水族馆","11"));
    //    animationMapper.deleteByPrimaryKey(1);
      //  charactersMapper.deleteByPrimaryKey(1);
//        AnimationMapper mapper = sqlSession.getMapper(AnimationMapper.class);
//        for (int i = 0; i < 10; i++) {
//            String uid = UUID.randomUUID().toString().substring(0, 5)+i;
//            mapper.insertSelective(new Animation(null,uid+"",uid+""));
//        }
        /*List<Characters> characters = charactersMapper.selectByExample(null);
       // System.out.println(characters.toString());
        for (Characters ch: characters
             ) {
            System.out.println(ch);
        }*/
        String str = "09-12";
//        str = "%"+str;

        List<Characters> list = charactersMapper.selectByToday(str);
        for (Characters ch: list
        ) {
            System.out.println(ch);
        }

    }
}
