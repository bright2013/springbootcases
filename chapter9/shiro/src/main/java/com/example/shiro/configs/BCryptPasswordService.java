/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: BCryptPasswordService
 * Author:   hzg
 * Date:     2020-02-12 19:52
 * Description: 密码服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.shiro.configs;

import org.apache.shiro.authc.credential.PasswordService;
import org.mindrot.jbcrypt.BCrypt;

/**
 * 〈一句话功能简述〉<br> 
 * 〈密码服务〉
 *
 * @author hzg
 * @create 2020-02-12
 * @since 1.0.0
 */
public class BCryptPasswordService implements PasswordService {

    @Override
    public String encryptPassword(Object plaintextPassword) throws IllegalArgumentException {
        final String str;
        if (plaintextPassword instanceof char[]) {
            str = new String((char[]) plaintextPassword);
        } else if (plaintextPassword instanceof String) {
            str = (String) plaintextPassword;
        } else {
            throw new IllegalArgumentException("Unsupported password type: " + plaintextPassword.getClass().getName());
        }
        return BCrypt.hashpw(str, BCrypt.gensalt());
    }

    @Override
    public boolean passwordsMatch(Object submittedPlaintext, String encrypted) {
        return BCrypt.checkpw(new String((char[]) submittedPlaintext), encrypted);
    }

    public boolean passwordsMatchString(String submittedPlaintext, String encrypted) {
        return BCrypt.checkpw( submittedPlaintext, encrypted);
    }
}

