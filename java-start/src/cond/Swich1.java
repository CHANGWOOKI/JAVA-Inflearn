package cond;

public class Swich1 {
    public static void main(String[] args) {
        // 1등급 : 1000, 2등급 : 2000, 3등급 : 3000, 4등급 : 4000 쿠폰증정
        // if 문으로 풀이
        int grade = 3;
        int coupon = 0;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else if (grade == 4) {
            coupon = 4000;
        }

        System.out.println(coupon);
    }
}
