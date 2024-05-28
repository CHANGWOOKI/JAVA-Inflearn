package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2024, 3, 20, 2, 10, 30, 30);
        System.out.println(localDateTime);

        // 날짜와 시간 분리
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);

        // 계산(불변)
        LocalDateTime localDateTime2 = localDateTime1.plusYears(2);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = localDateTime1.plusHours(3);
        System.out.println(localDateTime3);

        // 비교
        System.out.println("현재시간 지정시간 이전인가" + now.isBefore(localDateTime));
        System.out.println("현재시간 지정시간 이후인가" + now.isAfter(localDateTime));
        System.out.println("현재시간 지정시간 동일한가" + now.isEqual(localDateTime));
    }
}