import model.Movie;
import model.Reservation;
import model.Screen;
import model.Snack;
import service.Discount;
import service.MovieService;
import service.SnackService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //영화를 예매해 봅시다
        //상영관
        List<Screen> screens = new ArrayList<>(
                List.of(
                        new Screen("A", "LARGE", 300),
                        new Screen("B", "SMALL", 100),
                        new Screen("C", "MIDDLE", 200)
                )
        );
        // 영화
        MovieService movieService = new MovieService(
                new ArrayList<>(
                        List.of(
                                new Movie("인어 공주", LocalDateTime.of(2023, 6, 1, 18, 10),10000.00, 0, screens.get(0)),
                                new Movie("가디언즈 오즈 갤럭시", LocalDateTime.of(2023, 6, 1, 15, 20),10000.00, 12, screens.get(1)),
                                new Movie("범죄 도시3", LocalDateTime.of(2023, 6, 1, 19, 20),10000.00, 15, screens.get(2))
                        )
                )
        );
        //간식
        SnackService snackService  = new SnackService(
                new ArrayList<>(
                        List.of(
                                new Snack("팝콘", 5000 , "LARGE"),
                                new Snack("콜라", 3000 , "LARGE"),
                                new Snack("버터구이 오징어", 10000, "MIDDLE")
                        )
                )
        );

        Discount discount1 = new Discount("카드",10.00);

        Discount discount2 = new Discount("통신",5.00);

        List<Discount> discounts = new ArrayList<>();
        discounts.add(discount1);
        discounts.add(discount2);


        /***************** 실제 예매 하는 부분 ******************/
        //예약자
//        Reservation reservation = new Reservation("이재민", 12);
//
//        String movieTitle = "인어 공주";
//        for(Movie movie: movies) {
//            if(movieTitle.equals(movie.getTitle())) {
//                reservation.setMovie(movie);
//                //나이 제한 구현
//            }
//        }
//
//        String snackType = "팝콘";
//        for(Snack snack: snacks) {
//            if(snackType.equals(snack.getType())) {
//                reservation.setSnack(snack);
//            }
//        }
//
//        String discountType = "카드";
//        for(Discount discount: discounts) {
//            if(discountType.equals(discount.getType())) {
//                reservation.setDiscount(discount);
//            }
//        }
//
//        // 할인 되서 된 계산
//        Double price = reservation.getMovie().getPrice();
//        Double rate = reservation.getDiscount().getRate();
//
//        Double ratePrice = price * (rate / 100);
//        reservation.setAmount(price - ratePrice);
//
//        System.out.println("************* 영화 예매 확인 ************");
//        System.out.println("    구매자: " + reservation.getName());
//        System.out.println("    영화 제목: " + reservation.getMovie().getTitle());
//        System.out.println("    시간: " + reservation.getMovie().getStartTime().format(DateTimeFormatter.ISO_DATE));
//        System.out.println("    상영관: " + reservation.getMovie().getScreen().getScreenNo());
//        System.out.println("    간식: " + reservation.getSnack().getType() + " " + reservation.getSnack().getSize());
//        System.out.println("    금액: " + (reservation.getAmount() + reservation.getSnack().getPrice()));

    }
}