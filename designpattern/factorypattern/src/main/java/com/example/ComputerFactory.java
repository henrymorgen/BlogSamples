package com.example;

/**
 * Created by Administrator on 2016/11/7 0007.
 */

public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
