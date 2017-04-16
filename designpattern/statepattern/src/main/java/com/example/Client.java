package com.example;

/**
 * Created by Administrator on 2017/4/16 0016.
 */

public class Client {
    public static void main(String[] args){
        Context context=new Context();
        context.setMp3State(new PowerOffState());
        context.preSong();
        context.powerOn();
        context.nextSong();
        context.powerOff();
    }
}
