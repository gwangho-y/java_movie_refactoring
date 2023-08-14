package model;


import imp.Discountable;
import service.Discount;

public class Reservation implements Discountable {
    private String name;
    private Integer age;
    private Double amount;
    private Movie movie;
    private Snack snack;

    Discount discount = new Discount();

    public Reservation(String name, Integer age, Movie movie, Snack snack ) {
        this.name = name;
        this.age = age;
        this.movie = movie;
        this.snack = snack;
        this.amount = snack.getPrice() + movie.getPrice();
    }
    public Reservation(String name, Integer age, Movie movie, Snack snack, String type) {
        this(name, age, movie, snack);
        this.amount = discountAmount(movie.getPrice(), type) + discountAmount(snack.getPrice(), type);
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

    @Override
    public Double discountAmount(Double price, String type) {
        return discount.discountAmount(price, type);
    }
}
