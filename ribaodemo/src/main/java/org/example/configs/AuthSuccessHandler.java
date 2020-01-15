/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: AuthSuccessHandler
 * Author:   hzg
 * Date:     2019-12-27 12:28
 * Description: 登陆成功后的处理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.configs;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * 〈一句话功能简述〉<br> 
 * 〈登陆成功后，按不同的角色进行跳转处理〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@Component
public class AuthSuccessHandler implements AuthenticationSuccessHandler {

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /*
     * 功能描述: <br>
     * 〈跳转处理的逻辑，按角色不同跳转的url不同〉
     *
     * @params:
     * @return:
     * @since: 1.0.0
     * @Author: hzg
     * @Date: 2019-12-27 14:03
     */

    @Override
    public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1,
                                        Authentication authentication) throws IOException, ServletException {

        boolean hasStudentRole = false;
        boolean hasAdminRole = false;
        boolean hasTeacherRole = false;
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                hasAdminRole = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("ROLE_TEACHER")) {
                hasTeacherRole = true;
                break;
            }else if (grantedAuthority.getAuthority().equals("ROLE_STUDENT")) {
                hasStudentRole = true;
                break;
            }

        }

        if (hasTeacherRole || hasAdminRole) {
            redirectStrategy.sendRedirect(arg0, arg1, "/classreport");
        } else if (hasStudentRole) {
            redirectStrategy.sendRedirect(arg0, arg1, "/write");
        } else {
            throw new IllegalStateException();
        }
    }

}