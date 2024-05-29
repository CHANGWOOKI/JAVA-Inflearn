package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0);
        System.out.println("기분 시각 : " + dt);

        LocalDateTime newDt = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("newDt = " + newDt);
    }
}
