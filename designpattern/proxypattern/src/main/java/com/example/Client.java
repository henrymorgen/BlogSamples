package com.example;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/11/8 0008.
 */

public class Client {
    public static void main(String[] args){
        //创建LiuWangShu
        IShop liuwangshu=new LiuWangShu();
        //创建动态代理
        DynamicPurchasing  mDynamicPurchasing=new DynamicPurchasing(liuwangshu);
        //创建LiuWangShu的ClassLoader
        ClassLoader loader=liuwangshu.getClass().getClassLoader();
        //动态创建代理类
        IShop purchasing= (IShop) Proxy.newProxyInstance(loader,new Class[]{IShop.class},mDynamicPurchasing);
        purchasing.buy();
    }
}
