/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: GreetingFilter
 * Author:   hzg
 * Date:     2020-02-04 10:44
 * Description: webfilter测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.webfilterdemo.configs;

/**
 * 〈一句话功能简述〉<br> 
 * 〈webfilter测试〉
 *
 * @author hzg
 * @create 2020-02-04
 * @since 1.0.0
 */
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/greeting")
@Order(1)//指定过滤器的执行顺序,值越大越靠后执行
public class GreetingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("访问的IP地址：\t" + servletRequest.getRemoteAddr());
        System.out.println("访问的端口：\t" + servletRequest.getRemotePort());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
