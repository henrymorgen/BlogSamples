package com.example;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class Purchasing implements IShop {
    private IShop mShop;
    public Purchasing(IShop shop){
        mShop=shop;
    }
    @Override
    public void buy() {
        mShop.buy();
    }
}
