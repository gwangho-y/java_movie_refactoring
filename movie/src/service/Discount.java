package service;

public class Discount implements DiscountType {
    @Override
    public Double discountAmount(Double price, String type) {
        return null;
    }

//    public static Double discountAmount(Double price, String type) {
//        switch (type) {
//            case "카드":
//                price -= price * (10.00 / 100);
//                break;
//            case "통신":
//                price -= price * (5.00 / 100);
//                break;
//        }
//        return price;
//    }
}
