package model;

import service.Discount;

public class Reservation {
    private String name;
    private Integer age;
    private Double amount;
    private Movie movie;
    private Snack snack;

    public Reservation( String name, Integer age, Double amount, Movie movie, Snack snack ) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.movie = movie;
        this.snack = snack;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAmount() {
        return amount;
    }

    public Movie getMovie() {
        return movie;
    }

    public Snack getSnack() {
        return snack;
    }
}
