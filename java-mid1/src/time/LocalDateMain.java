package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        //
        LocalDate ofDate = LocalDate.of(2024, 5, 26);
        System.out.println(ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);

    }
}
