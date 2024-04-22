package cond;

public class Swich3 {
    public static void main(String[] args) {
        // 1등급 : 1000, 2등급,3등급 : 3000, 4등급 : 4000 쿠폰증정
        // brack 없다면 다음 문장으로 진행
        // case2 이후 3으로 이동하여 coupon이 3000이 됐음
        // swich 문으로 풀이

        int grade = 2;
        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
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
