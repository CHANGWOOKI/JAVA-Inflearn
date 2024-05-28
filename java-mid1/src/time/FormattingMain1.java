package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println(date.getYear() + "년" + date.getMonthValue() + "월");
        // 포맷터 생성
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        
        // 포맷팅
        String dateNow = date.format(formatter);
        System.out.println("dateNow = " + dateNow);
        
        // 파싱
        String input = "2023년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDate);

    }
}
