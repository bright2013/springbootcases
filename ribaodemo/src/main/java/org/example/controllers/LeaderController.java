/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: StudentController
 * Author:   hzg
 * Date:     2019-12-27 11:19
 * Description: 学生页面的处理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.controllers;

import org.example.models.Report;
import org.example.models.User;
import org.example.repositories.ReportRepository;
import org.example.repositories.UserRepository;
import org.example.utils.ResponseCode;
import org.example.utils.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈小组页面的处理〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/leader")
public class LeaderController {

    @Resource
    ReportRepository reportRepository;

    @Resource
    UserRepository userRepository;


    @RequestMapping("/allgroupreports")
    public ResponseEntity<Object> allMyReport(){
        // 获取当前登陆用户信息
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
             username = ((UserDetails)principal).getUsername();
        } else {
             username = principal.toString();
        }
        //根据用户名查找用户信息并保存到数据库
        User user = userRepository.findByUsernameEquals(username);
        String groupName = user.getGroupname();

        ResponseData responseData = new ResponseData();
        List<Report> reports = reportRepository.findAllByCreatedGroupEquals(groupName);
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        responseData.setResultData(reports);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }






}
