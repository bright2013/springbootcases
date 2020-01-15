/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Column
 * Author:   hzg
 * Date:     2020-01-07 12:39
 * Description: 示例列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例列〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();
}
