package enumeration.ex1;


import enumeration.ex0.DiscountService;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int prine = 10000;

        int basic = discountService.discount("BASIC", prine);
        int gold = discountService.discount("GOLD", prine);
        int diamond = discountService.discount("DIAMOND", prine);
        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", prine);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
        System.out.println("VIP : " + vip);
    }
}
