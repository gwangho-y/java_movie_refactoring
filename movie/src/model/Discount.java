package model;

import imp.Discountable;

public class Discount {
    String type;
    Double rate;

    public Discount(String type, Double rate) {
        this.type = type;
        this.rate = rate;
    }
}
