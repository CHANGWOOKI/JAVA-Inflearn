package array.ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0)
                System.out.print(", ");
        }
    }
}
