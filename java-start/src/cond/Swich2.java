package cond;

public class Swich2 {
    public static void main(String[] args) {
        // 1등급 : 1000, 2등급 : 2000, 3등급 : 3000, 4등급 : 4000 쿠폰증정
        // swich 문으로 풀이

        int grade = 4;
        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            case 4:
                coupon = 4000;
                break;
        }

        System.out.println(coupon);

    }
}
