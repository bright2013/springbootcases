/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: HelloWorldController
 * Author:   hzg
 * Date:     2020-01-09 13:28
 * Description: 示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例〉
 *
 * @author hzg
 * @create 2020-01-09
 * @since 1.0.0
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String firstPage(){
        return "index";
    }

}
