package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    /*
    在SecurityConfig配置了路由的拦截规则。未通过时会返回登录界面
     */

    @GetMapping("/")
    public String home() {

        return "loginpage"; //view
    }

    @GetMapping("/login")
    public String login() {

        return "loginpage"; //view
    }

    @GetMapping("/write")
    public String writePaper() {
        return "writepaper"; //view
    }

    @GetMapping("/myreport")
    public String myreport() {
        return "reportlist"; //view
    }

    @GetMapping("/groupreport")
    public String groupreport() {
        return "groupreportlist"; //view
    }

    @GetMapping("/classreport")
    public String classreport() {
        return "classreportlist"; //view
    }

}