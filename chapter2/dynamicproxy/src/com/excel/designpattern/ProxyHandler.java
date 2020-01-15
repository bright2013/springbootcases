/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: ProxyHandler
 * Author:   hzg
 * Date:     2020-01-07 08:44
 * Description: 动态代理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈动态代理〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;
    private int visitorCode;
    public ProxyHandler(Object object, int visitorCode){
        this.object = object;
        this.visitorCode = visitorCode;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (this.visitorCode == 1 ) {
            System.out.println("您可以拜访病人");
            method.invoke(object, args);
        } else {
            System.out.println("您不可以拜访病人");
        }
        return null;
    }

}
