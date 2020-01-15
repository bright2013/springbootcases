/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: UserRoles
 * Author:   hzg
 * Date:     2019-12-27 08:17
 * Description: 角色
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈角色〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "t_user_roles")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    private String username;

    private String rolename;


}
