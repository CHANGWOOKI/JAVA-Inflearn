package cond;

public class Swich4 {
    public static void main(String[] args) {
        // 1등급 : 1000, 2등급 : 2000, 3등급 : 3000, 4등급 : 4000 쿠폰증정
        // 새로운 swich 문으로 풀이

        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println(coupon);

    }
}
