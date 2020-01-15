/**
 * Copyright (C), 2019-2020, 软件卓越人才班
 * FileName: Ribao
 * Author:   hzg
 * Date:     2020-01-14 15:58
 * Description: 日报的类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.excel.modelview.controllers;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日报的类〉
 *
 * @author hzg
 * @create 2020-01-14
 * @since 1.0.0
 */
public class Ribao {
    private String gongcuoneirong;
    private String kunnan;
    private String banfa;
    private String xinde;
    private String jihua;

    public Ribao() {

    }

    public Ribao(String gongcuoneirong, String kunnan, String banfa, String xinde, String jihua) {
        this.gongcuoneirong = gongcuoneirong;
        this.kunnan = kunnan;
        this.banfa = banfa;
        this.xinde = xinde;
        this.jihua = jihua;
    }

    public String getGongcuoneirong() {
        return gongcuoneirong;
    }

    public void setGongcuoneirong(String gongcuoneirong) {
        this.gongcuoneirong = gongcuoneirong;
    }

    public String getKunnan() {
        return kunnan;
    }

    public void setKunnan(String kunnan) {
        this.kunnan = kunnan;
    }

    public String getBanfa() {
        return banfa;
    }

    public void setBanfa(String banfa) {
        this.banfa = banfa;
    }

    public String getXinde() {
        return xinde;
    }

    public void setXinde(String xinde) {
        this.xinde = xinde;
    }

    public String getJihua() {
        return jihua;
    }

    public void setJihua(String jihua) {
        this.jihua = jihua;
    }

    @Override
    public String toString() {
        return "Ribao{" +
                "gongcuoneirong='" + gongcuoneirong + '\'' +
                ", kunnan='" + kunnan + '\'' +
                ", banfa='" + banfa + '\'' +
                ", xinde='" + xinde + '\'' +
                ", jihua='" + jihua + '\'' +
                '}';
    }
}
