package model;

import imp.Discountable;

public class Snack  {
    // 종류
    private String name;

    //가격
    private Double price;

    //사이즈
    private String size;

    public Snack(String type, Double price, String size) {
        this.name = type;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
