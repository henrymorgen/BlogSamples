package com.example;

/**
 * Created by Administrator on 2016/11/12 0012.
 */

public class Client {
    public static void main(String[]args) {
        Goods goods1=GoodsFactory.getGoods("iphone7");
        goods1.showGoodsPrice("32G");
        Goods goods2=GoodsFactory.getGoods("iphone7");
        goods2.showGoodsPrice("32G");
        Goods goods3=GoodsFactory.getGoods("iphone7");
        goods3.showGoodsPrice("128G");
    }
}
