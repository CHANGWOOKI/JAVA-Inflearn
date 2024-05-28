package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("NOW : " + now);

        LocalDateTime localDateTime = LocalDateTime.of(2024, 5, 28, 14, 7, 47);
        System.out.println("LocalDateTime : " + localDateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"));
        System.out.println("OffsetDateTime : " + offsetDateTime);

    }
}
