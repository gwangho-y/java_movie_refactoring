package model;

import service.Discount;

public class Reservation {
    private String name;
    private Integer age;
    private Double amount;
    private Movie movie;
    private Snack snack;
    private Discount discount;

    public Reservation(String name, Integer age, Double amount, Movie movie, Snack snack, Discount discount) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.movie = movie;
        this.snack = snack;
        this.discount = discount;
    }
}
