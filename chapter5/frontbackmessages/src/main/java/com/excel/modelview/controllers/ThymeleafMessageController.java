/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: ThymeleafMessageController
 * Author:   hzg
 * Date:     2020-01-14 19:57
 * Description: thymeleaf列表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.modelview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈thymeleaf列表〉
 *
 * @author hzg
 * @create 2020-01-14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/thymeleafribao")
public class ThymeleafMessageController {
    static List<Ribao> ribaoList=new ArrayList<>();



    //初始化数据
    static{
        ribaoList.add(new Ribao("测试内容1", "困难1","办法1","心得1","计划1"));
        ribaoList.add(new Ribao("测试内容2", "困难2","办法2","心得2","计划1"));
    }

    @GetMapping("/getribao")
    public String getRibao(Model model){
        Ribao ribao =new Ribao("测试内容1", "困难1","办法1","心得1","计划1");
        model.addAttribute("tribao", ribao);
        return "tribao";
    }

    @GetMapping("/getall")
    public String getAllRibao(Model model){
        model.addAttribute("tribaolist", ribaoList);
        return "tribaolist";
    }
}
