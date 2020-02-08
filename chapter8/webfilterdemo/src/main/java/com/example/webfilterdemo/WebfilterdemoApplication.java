package com.example.webfilterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan   //Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
public class WebfilterdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfilterdemoApplication.class, args);
    }

}
