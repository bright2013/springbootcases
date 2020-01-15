/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: AnnoTest
 * Author:   hzg
 * Date:     2020-01-07 12:51
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
public class AnnoTest {

    public static String query(Person person) {
        StringBuilder stringBuilder = new StringBuilder();
        //通过反射，获取Class对象
        Class p = person.getClass();
        //判断此Class是不是注解类
        boolean exist = p.isAnnotationPresent(Table.class);
        if (!exist) {
            return null;
        }
        //如果是，强制类型转换成Table
        Table table = (Table) p.getAnnotation(Table.class);
        String tableName = table.value();

        //拼接sql语句
        stringBuilder.append("select * from ").append(tableName).append(" where 1 =1");

        Field[] fields = p.getDeclaredFields();
        for (Field field : fields) {
            boolean fExist = field.isAnnotationPresent(Column.class);
            if (!fExist) {
                return null;
            }
            Column column = (Column) field.getAnnotation(Column.class);
            String columnName = column.value();
            String fieldName = field.getName();
            Object fieldValue = null;
            //生成getxxx方法，用于反射执行对应的get方法，获取字段值
            String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            try {
                Method method = p.getMethod(getMethodName);
                fieldValue = method.invoke(person);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            stringBuilder.append(" and ").append(columnName).
                    append(" = '").append(fieldValue).append("'");

        }
        return stringBuilder.toString();
    }


    public static void main(String[] args){
        Person p1= new Person();
        //设置表名和列名
        p1.setName("zhangsan");
        p1.setUserName("zhangsan");

        String queryString = query(p1);
        System.out.println(queryString);
    }

}
