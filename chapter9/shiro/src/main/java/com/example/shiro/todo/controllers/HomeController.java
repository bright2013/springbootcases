/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: HomeController
 * Author:   hzg
 * Date:     2020-02-12 12:38
 * Description: 首页
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.shiro.todo.controllers;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈首页〉
 *
 * @author hzg
 * @create 2020-02-12
 * @since 1.0.0
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String todos(Model model) {
        return "loginpage";
    }

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            model.addAttribute("msg", "用户名或密码不能为空！");
            return "loginpage";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            if ( subject.hasRole("admin") ) {
                //show the ‘Create User’ button
                System.out.println("admin登陆");
            } else {
                //grey-out the button?
                System.out.println("其他角色登陆");
            }
            if ( subject.isPermitted("todo:delete") ) {
                System.out.println("允许权限todo:delete");
            } else {
                System.out.println("其他权限");
            }
            return "redirect:/index";
        }catch (LockedAccountException lae) {
            token.clear();
            model.addAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
            return "loginpage";
        } catch (AuthenticationException e) {
            token.clear();
            model.addAttribute("msg", "用户或密码不正确！");
            return "loginpage";
        }
    }

    @GetMapping("/logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "redirect:/";
    }
}
