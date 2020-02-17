/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: UserRepository
 * Author:   hzg
 * Date:     2020-02-12 19:02
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.shiro.todo.repository;

import com.example.shiro.todo.domain.Todo;
import com.example.shiro.todo.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户〉
 *
 * @author hzg
 * @create 2020-02-12
 * @since 1.0.0
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User findUserByUsername(String username);

}
