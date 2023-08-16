package model;

import java.time.LocalDateTime;

public class Movie {
    //영화 제목
    private String title;
    //상영 시간
    private LocalDateTime startTime;
    //가격
    private Double price;
    //등급
    private Integer restricted;
    //상영관
    private Screen screen;

    public Movie(String title, LocalDateTime startTime, Double price, Integer restricted, Screen screen) {
        this.title = title;
        this.startTime = startTime;
        this.price = price;
        this.restricted = restricted;
        this.screen = screen;
    }


    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Double getPrice() {
        return price;
    }

    public Screen getScreen() {
        return screen;
    }

    public Integer getRestricted() {
        return restricted;
    }
}
