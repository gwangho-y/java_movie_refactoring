import model.Discount;
import model.Movie;
import model.Screen;
import model.Snack;
import service.DiscountManager;
import service.MovieManager;
import service.SnackManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //영화를 예매해 봅시다
    //상영관
    static List<Screen> screens = new ArrayList<>(
            List.of(
                    new Screen("A", "LARGE", 300),
                    new Screen("B", "SMALL", 100),
                    new Screen("C", "MIDDLE", 200)
            )
    );

    // 영화
    static MovieManager movieService = new MovieManager(
            new ArrayList<>(
                    List.of(
                            new Movie("인어 공주", LocalDateTime.of(2023, 6, 1, 18, 10),10000.00, 0, screens.get(0)),
                            new Movie("가디언즈 오즈 갤럭시", LocalDateTime.of(2023, 6, 1, 15, 20),10000.00, 12, screens.get(1)),
                            new Movie("범죄 도시3", LocalDateTime.of(2023, 6, 1, 19, 20),10000.00, 15, screens.get(2))
                    )
            )
    );

    //간식
    static SnackManager snackService  = new SnackManager(
            new ArrayList<>(
                    List.of(
                            new Snack("팝콘", 5000.00 , "LARGE"),
                            new Snack("콜라", 3000.00 , "LARGE"),
                            new Snack("버터구이 오징어", 10000.00, "MIDDLE")
                    )
            )
    );

    // 할인 수단
    public static DiscountManager discountManager = new DiscountManager(
            new ArrayList<>(
                    List.of(
                            new Discount("카드", 10.0),
                            new Discount("현금", 5.0)
                    )
            )
    );
    public static void main(String[] args) {







        /***************** 실제 예매 하는 부분 ******************/
//        Reservation reservation = new Reservation(
//                    "이광호",
//                    22,
//                    Discount.discountAmount(movieService.getMovie("인어 공주").getPrice(), "카드"),
//                    movieService.getMovie("인어 공주"),
//                    snackService.getSnack("팝콘")
//                );
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