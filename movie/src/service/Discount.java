package service;

import imp.Discountable;

public class Discount {

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
