package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();
        System.out.println("Now : " + now);

        ZonedDateTime zoneNow = ZonedDateTime.now();
        System.out.println("ZoneNow : " + zoneNow);
        Instant from = Instant.from(zoneNow);
        System.out.println("From : " + from);

        Instant epochStart = Instant.ofEpochSecond(300000);
        System.out.println("epochSecond : " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(33333);
        System.out.println("later : " + later);

        // 조회
        long epochSecond = later.getEpochSecond();
        System.out.println("epochSecond :  " + epochSecond);


    }
}
