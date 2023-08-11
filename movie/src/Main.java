import model.Movie;
import model.Reservation;
import model.Screen;
import model.Snack;
import service.Discount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //영화을 예매 해 봅시다
        //상영관
        Screen screenA = new Screen("A", "LARGE", 300);
        Screen screenB = new Screen("B", "SMALL", 100);
        Screen screenC = new Screen("C", "MIDDLE", 200);

        List<Screen> screens = new ArrayList<>();
        screens.add(screenA);
        screens.add(screenB);
        screens.add(screenC);

        // 영화
        Movie movie1 = new Movie("인어 공주", LocalDateTime.of(2023, 6, 1, 18, 10),10000.00, 0, screenA);
        Movie movie2 = new Movie("가디언즈 오즈 갤럭시", LocalDateTime.of(2023, 6, 1, 15, 20),10000.00, 12, screenC);
        Movie movie3 = new Movie("범죄 도시3", LocalDateTime.of(2023, 6, 1, 19, 20),10000.00, 15, screenB);


        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);


        //간식
        Snack snack1 = new Snack("팝콘", 5000 , "LARGE");


        Snack snack2 = new Snack("콜라", 3000 , "LARGE");

        Snack snack3 = new Snack("버터구이 오징어", 10000 , "LARGE");



        List<Snack> snacks = new ArrayList<>();
        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);

        Discount discount1 = new Discount("카드",10.00);


        Discount discount2 = new Discount("통신",5.00);


        List<Discount> discounts = new ArrayList<>();
        discounts.add(discount1);
        discounts.add(discount2);

        /***************** 실제 예매 하는 부분 ******************/
        //예약자
        Reservation reservation = new Reservation();
        reservation.setName("이재민");

        reservation.setAge(12);
        String movieTitle = "인어 공주";
        for(Movie movie: movies) {
            if(movieTitle.equals(movie.getTitle())) {
                reservation.setMovie(movie);

                //나이 제한 구현
            }
        }

        String snackType = "팝콘";
        for(Snack snack: snacks) {
            if(snackType.equals(snack.getType())) {
                reservation.setSnack(snack);
            }
        }

        String discountType = "카드";
        for(Discount discount: discounts) {
            if(discountType.equals(discount.getType())) {
                reservation.setDiscount(discount);
            }
        }

        // 할인 되서 된 계산
        Double price = reservation.getMovie().getPrice();
        Double rate = reservation.getDiscount().getRate();

        Double ratePrice = price * (rate / 100);
        reservation.setAmount(price - ratePrice);

        System.out.println("************* 영화 예매 확인 ************");
        System.out.println("    구매자: " + reservation.getName());
        System.out.println("    영화 제목: " + reservation.getMovie().getTitle());
        System.out.println("    시간: " + reservation.getMovie().getStartTime().format(DateTimeFormatter.ISO_DATE));
        System.out.println("    상영관: " + reservation.getMovie().getScreen().getScreenNo());
        System.out.println("    간식: " + reservation.getSnack().getType() + " " + reservation.getSnack().getSize());
        System.out.println("    금액: " + (reservation.getAmount() + reservation.getSnack().getPrice()));

    }
}