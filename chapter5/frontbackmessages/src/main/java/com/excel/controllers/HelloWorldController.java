/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: HelloWorldController
 * Author:   hzg
 * Date:     2020-01-14 10:54
 * Description: 示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例〉
 *
 * @author hzg
 * @create 2020-01-14
 * @since 1.0.0
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    /**
     * 配置@RequestMapping 拦截 localhost:8080/hello/world 请求
     * @return
     */
    @RequestMapping("/world")
    public String helloWorld(){
        System.out.println("hello world");
        return "helloworld";
    }

    /**
     * localhost:8080/hello/pathVariable/bigsea
     * localhost:8080/hello/pathVariable/sea
     * 这些URL 都会 执行此方法 并且将  bigsea、sea 作为参数 传递到name字段
     * @param name
     * @return
     */
    @RequestMapping("/pathVariable/{name}")
    public String pathVariable(@PathVariable("name")String name){
        System.out.println("hello "+name);
        return "helloworld";
    }

    /**
     配置@RequestParam 抽取localhost:8080/hello/requestParam?firstName=big&lastName=sea中的参数
     * 如果 required = true 则表示请求参数对应的 字段 必须存在.如果不存在则会抛出异常<br/>
     * @param firstName 可以为null
     * @param lastName 不能为null .为null报异常
     * @param age age字段表示如果没有 age 参数 则默认值为 0
     * @return
     */
    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(value="firstName",required=false)String firstName,
                               @RequestParam( value="lastName" ,required = true) String lastName,
                               @RequestParam(value="age",required = false ,defaultValue="0")int age) {
        System.out.println("hello my name is " + (firstName == null ? "" : firstName)
                + lastName + "," + age +" years old this year");
        return "helloworld";
    }




}
