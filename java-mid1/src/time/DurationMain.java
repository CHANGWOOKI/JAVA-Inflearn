package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration : " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime : " + localTime);

        // 계산에 사용
        LocalTime plusTime = localTime.plus(duration);
        System.out.println("plusTime : " + plusTime);

        // 시간 차이
        LocalTime start = LocalTime.of(0, 0, 30, 11111);
        LocalTime end = LocalTime.of(9, 30, 20, 1234554);
        Duration between = Duration.between(start, end);
        System.out.println(between);
        // 초로 반환
        System.out.println(between.toSeconds());
        // 분으로 반환
        System.out.println(between.toMinutes());
        // 시간으로 반환
        System.out.println(between.toHours());
    }
}
