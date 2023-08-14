package service;

import model.Discount;
import model.Movie;

import java.util.ArrayList;


public class DiscountManager {
    private ArrayList<Discount> discounts;

    public DiscountManager(ArrayList<Discount> discounts) {
        this.discounts = discounts;
    }

    public Double discountAmount(Double price, String type) {
        switch (type) {
            case "카드":
                price -= price * (10.00 / 100);
                break;
            case "통신":
                price -= price * (5.00 / 100);
                break;
        }
        return price;
    }
}
