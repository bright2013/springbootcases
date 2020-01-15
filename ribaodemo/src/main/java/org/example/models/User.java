/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: User
 * Author:   hzg
 * Date:     2019-12-27 08:14
 * Description: 日报系统的用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日报系统的用户〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "t_users")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    @Column(unique = true)
    private String username;

    private String password;
    private Boolean enabled;
    private String classname;
    private String groupname;
    private String phonenumber;
    private String email;

}
