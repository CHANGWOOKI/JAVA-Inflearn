package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 5, 28, 16, 6, 20);
        System.out.println("dt = " + dt);

        LocalDateTime dtPlus = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("dtPlus = " + dtPlus);

        LocalDateTime dtPlus1 = dt.plusYears(30);
        System.out.println("dtPlus1 = " + dtPlus1);
    }
}
