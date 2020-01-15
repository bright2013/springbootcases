/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: ModelController
 * Author:   hzg
 * Date:     2020-01-14 12:07
 * Description: 示范model和modelview的用法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.modelview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示范model和modelview的用法〉
 *
 * @author hzg
 * @create 2020-01-14
 * @since 1.0.0
 */
@Controller
public class ModelController {

    private String message = "Model 示例";

    @GetMapping("/getMessage")
    public String getMessage(Model model) {

        model.addAttribute("message", message);

        return "show";
    }

    @GetMapping("/getMessage2")
    public ModelAndView getMessage() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("message", message);
        mav.setViewName("show");

        return mav;
    }

    @GetMapping("/getMessageAndTime")
    public String getMessageAndTime(ModelMap map) {

        LocalDateTime   ldt = LocalDateTime.now();

        DateTimeFormatter  fmt = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.MEDIUM);

        fmt.withLocale(new Locale("zh", "CN"));
        fmt.withZone(ZoneId.of("CET"));

        String time = fmt.format(ldt);

        map.addAttribute("message", message).addAttribute("time", time);

        return "show";
    }
}
