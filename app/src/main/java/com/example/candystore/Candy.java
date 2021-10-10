package com.example.candystore;

public class Candy {
    private int id;
    private String name;
    private double price;

    public Candy(int newID, String newName, double newPrice){
        setID(newID);
        setName(newName);
        setPrice(newPrice);
    }

    public void setID(int newID) {
        id=newID;
    }

    public void setName(String newName) {
        name=newName;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0.0)
            price = newPrice;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return id + " " + name + " " + price;
    }
}
