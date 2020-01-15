/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: RestMessageController
 * Author:   hzg
 * Date:     2020-01-14 15:45
 * Description: Restful 服务示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.modelview.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Restful 服务示例〉
 *
 * @author hzg
 * @create 2020-01-14
 * @since 1.0.0
 */
@RestController
@RequestMapping("/ribao")
public class RestMessageController {

    static List<Ribao> ribaoList=new ArrayList<>();



    //初始化数据
    static{
        ribaoList.add(new Ribao("测试内容1", "困难1","办法1","心得1","计划1"));
        ribaoList.add(new Ribao("测试内容2", "困难2","办法2","心得2","计划1"));
    }

    /*
     * 功能描述: <br>
     * 〈rest接口返回json对象〉
     *
     * @params:
     * @return:
     * @since: 1.0.0
     * @Author: hzg
     * @Date: 2020-01-14 16:06
     */

    @GetMapping("/getribao")
    public Ribao getRibao(){
        return new Ribao("测试内容1", "困难1","办法1","心得1","计划1");
    }

    /*
     * 功能描述: <br>
     * 〈rest接口返回json列表对象〉
     *
     * @params:
     * @return:
     * @since: 1.0.0
     * @Author: hzg
     * @Date: 2020-01-14 16:06
     */

    @GetMapping("/getall")
    public List<Ribao> getAllRibao(){
        return ribaoList;
    }

    /*
     * 功能描述: <br>
     * 〈rest接口接收json对象〉
     *
     * @params:
     * @return:
     * @since: 1.0.0
     * @Author: hzg
     * @Date: 2020-01-14 16:07
     */


    @PostMapping("/addribao")
    public Ribao addRibao(@RequestBody  Ribao ribao){
        System.out.println(ribao.toString());
        return ribao;
    }

}
