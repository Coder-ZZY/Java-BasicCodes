package com.zzy.ex2;

public class Goods {
    private String ID;
    private String Name;
    private int Price;
    private int Stocks;
    public Goods(){}
    public Goods(String ID, String Name,int Price, int Stocks){
        this.ID = ID;this.Name = Name;this.Price = Price;this.Stocks = Stocks;
    }
    public String getID(){return ID;}
    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){return Name;}
    public void setName(String Name){
        this.Name = Name;
    }
    public int  getPrice(){return Price;}
    public void setPrice(int Price){
        this.Price = Price;
    }
    public int getStocks(){return Stocks;}
    public void setStocks(){
        this.Stocks = Stocks;
    }
}
