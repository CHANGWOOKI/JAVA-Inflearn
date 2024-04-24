package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 실수를 입력하세요.");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 실수를 입력하세요.");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("첫 번째 숫자가 더 큽니다. " + num1);
        } else if (num2 > num1) {
            System.out.println("두 번째 숫자가 더 큽니다. " + num2);
        } else {
            System.out.println("두 숫자가 동일합니다.  ");
        }
    }

}
