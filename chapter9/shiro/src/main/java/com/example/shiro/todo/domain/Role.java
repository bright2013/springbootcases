/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Role
 * Author:   hzg
 * Date:     2020-02-12 19:04
 * Description: 权限
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
 * 〈权限〉
 *
 * @author hzg
 * @create 2020-02-12
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer roleId;
    public String roleName;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    public Set<Permission> permissions;

    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<User> userSet;

}
