package com.example;

/**
 * Created by Administrator on 2017/4/16 0016.
 */

public class PowerOffState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("开机");
    }
    @Override
    public void powerOff() {
    }
    @Override
    public void preSong() {
    }
    @Override
    public void nextSong() {
    }
}
