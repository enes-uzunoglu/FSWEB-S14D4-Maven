package org.example.model;

public class Coke extends ProductForSale{
    private boolean isCold;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    public Coke(String type,double price,String description,boolean isCold){
        super(type,price,description);
        this.isCold = isCold;
    }
    @Override
    public void showDetails(){
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
        System.out.println(isCold);
    }
}
