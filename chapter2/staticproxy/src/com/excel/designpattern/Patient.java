/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Patient
 * Author:   hzg
 * Date:     2020-01-07 08:23
 * Description: 病人示例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.designpattern;



/**
 * 〈一句话功能简述〉<br> 
 * 〈病人示例〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
public class Patient implements PatientProtectInterface {

    @Override
    public void showDetails(){
        System.out.println("检查病人，病人的情况正常。");
    }
}
