package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.of(20, 20, 20);
        System.out.println(localTime);

        localTime = localTime.plusSeconds(20);
        System.out.println(localTime);

        System.out.println(localTime.isAfter(LocalTime.now()));
    }
}
