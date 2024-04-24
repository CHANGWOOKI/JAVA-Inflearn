package array.ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int total = 0;
        double average = 0.0;

        System.out.println("5개 정수를 입력받아 합계,평균 구하는 프로그램");
        System.out.println("5개의 정수를 입력해주세요.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("입력한 정수 합계 : " + total);
        System.out.println("입력한 정수 평균 : " + average);


    }
}
