package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        // ChronoField 단위 별 추출
        LocalDateTime localDateTime = LocalDateTime.of(2030, 2, 10, 12, 4, 20);
        System.out.println("YEAR = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonthValue() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());

        System.out.println("localDateTime.get(ChronoField.MINUTE_OF_DAY) = " + localDateTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_DAY) = " + localDateTime.get(ChronoField.SECOND_OF_DAY));


    }
}
