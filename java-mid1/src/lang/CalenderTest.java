package lang;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalenderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        // 입력 받은 연, 월 1일
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        // 입력 받은 다음 달
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 월요일=1 ....일요일=7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("SU MO TU WE TH FR SA");
        // 시작 요일만큼 띄우기
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        // 시작날 새로운 참조 값으로 복사
        LocalDate dayIterator = firstDayOfMonth;

        // 다음달 되기 전까지 반복 (isBefore)
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            // dayIterator.getDayOfMonth() 값을 3칸씩 차지하며 출력
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            // 토요일에 띄어쓰기 조건문
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            // dayIterator.getDayOfMonth() 1일 씩 더하기
            dayIterator = dayIterator.plusDays(1);
        }
    }
}