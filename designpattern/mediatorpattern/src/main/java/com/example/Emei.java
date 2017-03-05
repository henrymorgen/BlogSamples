package com.example;

/**
 * Created by Administrator on 2017/3/4 0004.
 */

/**
 * 具体同事类（峨眉派）
 */
public class Emei extends United {
    public Emei(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Emei.this);
    }
    public void getNotice(String message) {
        System.out.println("峨眉收到消息：" + message);
    }
}
