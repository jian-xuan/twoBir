package com.gb.controller;

import com.gb.bean.Animation;
import com.gb.bean.Characters;
import com.gb.bean.Msg;
import com.gb.dao.CharactersMapper;
import com.gb.service.CharactersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;

@Controller
public class CharactersController {

    @Autowired
    CharactersService charactersService;

    @RequestMapping("/chs")
    @ResponseBody
    public Msg getCharactersWithJson(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //引入PageHelp 分页插件
        //在查询前只需要调用 传入页码，以及每页的大小

        PageHelper.startPage(pn,10);
        //startPage 后面紧跟的这个查询就是一个分页查询
        List<Characters> chs = charactersService.getAll();
        //使用pageInfo包装查询后的结果，只需要将pageInfo 交给页面就行
        //封装了详细的分页信息，包括我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(chs,10);
        model.addAttribute("pageInfo",page);
//        System.out.println("来到这里了");
        return  Msg.success().add("pageInfo",page);
    }

    /**
     * 检查动漫名称是否已经存在
     * @param chName
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkName")
    public Msg checkName(@RequestParam("chName") String chName){
        boolean b = charactersService.checkName(chName);
        if(b){
            return Msg.success();
        }else{
            return Msg.fail().add("msg","名称不可用");
        }
    }

    /**
     * 保存动漫人物
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "ch",method = RequestMethod.POST)
    public  Msg saveCharacters(Characters characters){
        charactersService.saveCharacters(characters);
        return Msg.success();
    }

    /**
     * 根据id查询人物信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/ch/{id}",method = RequestMethod.GET)
    public Msg getCh(@PathVariable("id") Integer id){
        Characters characters = charactersService.getCh(id);
        return Msg.success().add("ch",characters);
    }


    /**
     * 更新信息
     * @param characters
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/ch/{chId}",method = RequestMethod.PUT)
    public Msg updateCh(Characters characters){
        charactersService.updateCh(characters);
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/ch/{ids}",method = RequestMethod.DELETE)
    public Msg deleteCh(@PathVariable("ids") String ids){
        //批量删除
        if(ids.contains("-")){
            ArrayList<Integer> del_ids = new ArrayList<>();
            String[] str_ids = ids.split("-");
            //将所有学生id组装成集合
            for(String string : str_ids){
                del_ids.add(Integer.parseInt(string));
            }
            charactersService.deleteBatch(del_ids);
        }else{
            Integer id = Integer.parseInt(ids);
            charactersService.deleteCh(id);
        }
        return  Msg.success();
        }

        @ResponseBody
        @RequestMapping("/bir")
        public Msg getBirthday(Model model){
            Date date = new Date();
            java.sql.Date birthDate = new java.sql.Date(date.getTime());
            String str = birthDate.toString().substring(5);
            List<Characters> chbir= charactersService.getBir(str);

            PageHelper.startPage(1,10);
            //startPage 后面紧跟的这个查询就是一个分页查询
            //使用pageInfo包装查询后的结果，只需要将pageInfo 交给页面就行
            //封装了详细的分页信息，包括我们查询出来的数据，传入连续显示的页数
            PageInfo page = new PageInfo(chbir,10);
            model.addAttribute("pageInfo",page);
//        System.out.println("来到这里了");
            return  Msg.success().add("pageInfo",page);
        }

        @ResponseBody
        @RequestMapping("/select")
        public Msg select(@RequestParam(value = "str1") String str1,Model model){
            PageHelper.startPage(1,5);
            List<Characters> chs = charactersService.getSelect(str1);
            //使用pageInfo包装查询后的结果，只需要将pageInfo 交给页面就行
            //封装了详细的分页信息，包括我们查询出来的数据，传入连续显示的页数
            PageInfo page = new PageInfo(chs,5);
            model.addAttribute("pageInfo",page);
//        System.out.println("来到这里了");
            return  Msg.success().add("pageInfo",page);
        }
}
