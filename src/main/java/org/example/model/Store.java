package org.example.model;

import enums.chocolateColor;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("a",1,"z", chocolateColor.BLACK);
        ProductForSale coke = new Coke("b",2,"y",true);
        ProductForSale bread = new Bread("c",3,"v",1);

        ProductForSale[] products = {chocolate,coke,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            product.showDetails();
        }
    }
}