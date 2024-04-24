package array.ex;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;

        System.out.println("입력한 정수만큼 합계를 구하고, 평균을 구하는 프로그램");
        System.out.println("입력한 정수 갯수를 입력하세요.");
        count = scanner.nextInt();
        int[] numbers = new int[count];
        int sum = 0;
        double average = 0;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        System.out.println("입력한 정수 합계 : " + sum);
        System.out.println("입력한 정수 평균 : " + average);


    }
}
