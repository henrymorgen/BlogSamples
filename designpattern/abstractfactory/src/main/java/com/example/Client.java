package com.example;

/**
 * Created by Administrator on 2017/1/26 0026.
 */

public class Client {
    public static void main(String[]args) {
        LenovoFactory lenocoFactory=new LenovoFactory();
        lenocoFactory.createDesktopComputer().start();
        lenocoFactory.createNotebookComputer().start();
        HpFactory hpFactory=new HpFactory();
        hpFactory.createDesktopComputer().start();
        hpFactory.createNotebookComputer().start();
    }
}
