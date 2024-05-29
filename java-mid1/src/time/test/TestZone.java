package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoulTime = ZonedDateTime.of(time, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("seoulTime = " + seoulTime);
        System.out.println("londonTime = " + londonTime);
        System.out.println("newYorkTime = " + newYorkTime);

    }
}
