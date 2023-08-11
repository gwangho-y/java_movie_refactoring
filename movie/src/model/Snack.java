package model;

public class Snack {
    // 종류
    private String type;

    //가격
    private Integer price;

    //사이즈
    private String size;


    public Snack(String type, Integer price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
}
