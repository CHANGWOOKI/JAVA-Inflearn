package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("now = " + now);

        // 포맷팅
        String formatted = now.format(dateTimeFormatter);
        System.out.println("formatted = " + formatted);

        // 파싱
        LocalDateTime parsed = LocalDateTime.parse(formatted, dateTimeFormatter);
        System.out.println("parsed = " + parsed);


    }
}
