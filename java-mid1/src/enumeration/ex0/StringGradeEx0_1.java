package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int prine = 10000;

        int basic = discountService.discount("BASIC", prine);
        int gold = discountService.discount("GOLD", prine);
        int diamond = discountService.discount("DIAMOND", prine);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
