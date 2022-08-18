package com.zzy.ex2;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        goods[0] = new Goods("001","华为P40",99,1000);
        goods[1] = new Goods("002","保温杯",50,2000);
        goods[2] = new Goods("003","枸杞",15,90000);
        for (int i = 0; i < 3; i++){
            System.out.println(goods[i].getID()+","+goods[i].getName()+","+goods[i].getPrice()+","+goods[i].getStocks());
        }
    }
}
