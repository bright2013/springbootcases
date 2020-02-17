/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: User
 * Author:   hzg
 * Date:     2020-02-12 18:59
 * Description: 用户表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.shiro.todo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户表〉
 *
 * @author hzg
 * @create 2020-02-12
 * @since 1.0.0
 */
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;

    public String username;

    public String password;

    public Boolean enabled;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    public Set<Role> roles;


}
