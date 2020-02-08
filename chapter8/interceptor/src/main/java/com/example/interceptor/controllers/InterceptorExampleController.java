/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: InterceptorExampleController
 * Author:   hzg
 * Date:     2020-02-05 13:06
 * Description: 示例controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例controller〉
 *
 * @author hzg
 * @create 2020-02-05
 * @since 1.0.0
 */
@RestController
public class InterceptorExampleController {

    @GetMapping(value = "/greeting")
    public String customGreetings() {
        return "欢迎访问！";
    }
}

