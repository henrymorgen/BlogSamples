package com.example;

/**
 * Created by Administrator on 2017/3/4 0004.
 */

/**
 * 具体同事类（少林派）
 */
public class Shaolin extends United {
    public Shaolin(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message){
        wulinAlliance.notice(message,Shaolin.this);
    }
    public void getNotice(String message){
        System.out.println("少林收到消息："+message);
    }
}
