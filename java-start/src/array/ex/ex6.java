package array.ex;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.print("입력 받은 숫자 개수를 입력하세요 : ");
        count = scanner.nextInt();

        int[] numbers = new int[count];
        int maxNum = 0;
        int minNum = 0;

        System.out.println(count + "개의 숫자를 입력하세요.");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        maxNum = numbers[0];
        minNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }

        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);
    }
}
