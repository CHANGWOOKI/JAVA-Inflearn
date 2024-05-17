package enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int prine = 10000;

        int basic = discountService.discount(StringGrade.BASIC, prine);
        int gold = discountService.discount(StringGrade.GOLD, prine);
        int diamond = discountService.discount(StringGrade.DIAMOND, prine);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
