package service;

public class Discount {

    // 할인 종류
    private String type;
    // 할인율
    private Double rate;

    public Discount(String type, Double rate) {
        this.type = type;
        this.rate = rate;
    }
}
