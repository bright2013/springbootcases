/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Animal
 * Author:   hzg
 * Date:     2020-01-06 15:38
 * Description: 反射的动物类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.reflection;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反射的动物类〉
 *
 * @author hzg
 * @create 2020-01-06
 * @since 1.0.0
 */
public class Animal {
    public String name ="Dog";
    private int   age  =30 ;

    //默认无参构造函数
    public Animal(){
        System.out.println("Animal");
    }

    //带参数的构造函数
    public Animal(String name , int age){
        System.out.println(name+","+age);
    }

    //公开 方法  返回类型和参数均有
    public String sayName(String name){
        return "Hello,"+name;
    }


}
