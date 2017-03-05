package com.example;

/**
 * Created by Administrator on 2016/11/7 0007.
 */

public class Client {
    public static void main(String[]args) {
        ComputerFactory computerFactory = new GDComputerFactor();
        LenovoComputer mLenovoComputer=computerFactory.createComputer(LenovoComputer.class);
        mLenovoComputer.start();
    }
}