package model;

public class Screen {
    //상영관 번호
    private String screenNo;
    //상영관 크기
    private String size;

    //상영관 수용인원
    private Integer capacity;

    public Screen(String screenNo, String size, Integer capacity) {
        this.screenNo = screenNo;
        this.size = size;
        this.capacity = capacity;
    }


    public Integer getCapacity() {
        return capacity;
    }


}
