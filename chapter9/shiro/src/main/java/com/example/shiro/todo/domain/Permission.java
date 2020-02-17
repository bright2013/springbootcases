/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Permission
 * Author:   hzg
 * Date:     2020-02-12 19:18
 * Description: 权限
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.shiro.todo.domain;

import lombok.Data;

import javax.persistence.*;
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
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;
    private String permissionName;

    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "permissions", fetch = FetchType.LAZY)
    private Set<Role> roleSet;

}
