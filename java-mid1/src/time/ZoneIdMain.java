package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String a : ZoneId.getAvailableZoneIds()) {
            System.out.println(a);
            ZoneId zoneId = ZoneId.of(a);
            System.out.println(zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1 = zoneId.of("Asia/Seoul");
        System.out.println(zoneId1);
    }
}
