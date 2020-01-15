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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈老师页面的处理〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    ReportRepository reportRepository;

    @Resource
    UserRepository userRepository;


    @RequestMapping("/allclassreports")
    public ResponseEntity<Object> allMyReport(){
        ResponseData responseData = new ResponseData();
        List<Report> reports = reportRepository.findAll();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        responseData.setResultData(reports);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }






}
