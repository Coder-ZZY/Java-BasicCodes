package com.zzy.ex2;
public class Car {
    private String Name;
    private int Price;
    private String Color;
    public Car(){}
    public Car(String Name, int Price, String Color){
        this.Name = Name;this.Price = Price;this.Color = Color;
    }
    public String getName(){return Name;}
    public void setName(String Name){
        this.Name = Name;
    }
    public int getPrice(){return Price;}
    public void setPrice(int Price){
        this.Price = Price;
    }
    public String getColor(){return Color;}
    public void setColor(String Color){
        this.Color = Color;
    }
}
