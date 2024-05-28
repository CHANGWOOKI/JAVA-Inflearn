package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now.isSupported(ChronoField.MINUTE_OF_DAY) = " + now.isSupported(ChronoField.MINUTE_OF_DAY));

        //System.out.println("now.get(ChronoField.MINUTE_OF_DAY) = " + now.get(ChronoField.MINUTE_OF_DAY));
    }
}
