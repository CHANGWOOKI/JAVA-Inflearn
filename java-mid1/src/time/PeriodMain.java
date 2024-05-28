package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period periodDays = Period.ofDays(10);
        System.out.println("periodDays : " + periodDays);

        // 계산에 사용
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = localDate.plus(periodDays);
        System.out.println("localDate : " + localDate);
        System.out.println("plusDate : " + plusDate);

        // 기간 차이
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2023, 5, 25);
        Period between = Period.between(start, end);
        System.out.println("between : " + between);

    }
}
