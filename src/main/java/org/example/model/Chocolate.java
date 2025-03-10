package org.example.model;

import enums.chocolateColor;

public class Chocolate extends ProductForSale{
    private chocolateColor color;
    public Chocolate(String type,double price,String description){
        super(type,price,description);
    }

    public Chocolate(String type, double price, String description, chocolateColor color) {
        super(type, price, description);
        this.color = color;
    }

    @Override
    public void showDetails(){
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
        System.out.println(color);
    }
}
