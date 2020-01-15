/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: PatientGuardProxy
 * Author:   hzg
 * Date:     2020-01-07 08:21
 * Description: 代理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.designpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈代理类〉
 *
 * @author hzg
 * @create 2020-01-07
 * @since 1.0.0
 */
public class PatientGuardProxy implements PatientProtectInterface {

    private int visitorCode;

    private Patient patient = new Patient();

    @Override
    public void showDetails(){
        if (this.visitorCode == 1 ) {
            System.out.println("您可以拜访病人");
            patient.showDetails();
        } else {
            System.out.println("您不可以拜访病人");
        }
    }

    public void assignVisitorCode(String profession){
        if ("医生".equals(profession) || "护士".equals(profession)) {
            visitorCode = 1;
        } else {
            visitorCode = 0;
        }
    }
}
