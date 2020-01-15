/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Person
 * Author:   hzg
 * Date:     2020-01-07 12:46
 * Description: 示例类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.annotation;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例类〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
@Table("person")
public class Person {

    @Column("name")
    private String name;

    @Column("user_name")
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
