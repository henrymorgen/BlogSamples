package com.example;

/**
 * Created by Administrator on 2016/11/7 0007.
 */

public class GDComputerFactor extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer=null;
        String classname=clz.getName();
        try {
            //通过反射来生产不同厂家的电脑
            computer= (Computer) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
