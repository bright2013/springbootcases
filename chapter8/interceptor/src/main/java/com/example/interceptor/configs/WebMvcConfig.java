/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: WebMvcConfig
 * Author:   hzg
 * Date:     2020-02-05 13:01
 * Description: 配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.interceptor.configs;

import com.example.interceptor.interceptors.TimeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈配置〉
 *
 * @author hzg
 * @create 2020-02-05
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    //
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 适用于所有的url，也可以用.addPathPatterns添加url匹配规则.
        registry.addInterceptor(new TimeInterceptor());

    }

}
