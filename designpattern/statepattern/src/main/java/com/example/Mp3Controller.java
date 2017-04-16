package com.example;

public class Mp3Controller {
    private static final int POWER_ON = 1;
    private static final int POWER_OFF = 2;
    private int state = POWER_OFF;

    public void powerOn() {
        if (state == POWER_OFF) {
            System.out.println("开机");
        }
        state = POWER_ON;
    }

    public void powerOff() {
        if (state == POWER_ON) {
            System.out.println("关机");
        }
        state = POWER_OFF;
    }

    public void preSong() {
        if (state == POWER_ON) {
            System.out.println("上一首歌");
        }
    }

    public void nextSong() {
        if (state == POWER_ON) {
            System.out.println("下一首歌");
        }
    }
}
