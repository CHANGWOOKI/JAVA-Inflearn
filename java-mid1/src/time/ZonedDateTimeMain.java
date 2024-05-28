package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2024, 5, 28, 14, 7, 47);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2024, 5, 28, 14, 7, 47,123, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);

        ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utc);
    }
}
