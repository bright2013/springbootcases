/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: MainTest
 * Author:   hzg
 * Date:     2020-01-07 08:27
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.designpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
public class MainTest {
    public static void main(String[] args) {

        PatientGuardProxy patientGuardProxy = new PatientGuardProxy();
        patientGuardProxy.assignVisitorCode("医生");
        patientGuardProxy.showDetails();

    }
}
