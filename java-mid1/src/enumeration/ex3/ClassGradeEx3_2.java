package enumeration.ex3;
// static import 를 사용해서 더 간편하게 사용 가능
import static enumeration.ex3.Grade.*;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
