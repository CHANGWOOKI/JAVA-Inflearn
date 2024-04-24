package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int x = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        int y = scanner.nextInt();

        System.out.println("첫 번째 숫자와 두 번째 숫자 합은 : ");
        int sum = x + y;
        System.out.println(sum);


    }
}
