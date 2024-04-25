package method.ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        int balance = 0;
        int amount;

        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("| 1. 입급 | 2. 출금 | 3. 잔액 확인 | 4. 종료 |");
            System.out.println("--------------------------------------------");
            System.out.print("선택 : ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);

                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);

                    break;
                case 3:
                    System.out.println("현재 잔고 : " + balance);

                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }

    // 입금 메서드
    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원 입금하셨습니다. 잔고 : " + balance);
        return balance;
    }

    // 출금 메서드
    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원 출금하셨습니다. 잔고 : " + balance);
        } else {
            System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
        }
        return balance;
    }
}
