package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();
        String payOption;
        int amount;

        while (true) {
            System.out.print("결제 수단을 입력하세요. (종료=exit) : ");
            payOption = scanner.nextLine();

            // exit 종료
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            amount = scanner.nextInt();
            scanner.nextLine();

            // 결제 메서드 호출
            payService.processPay(payOption, amount);
        }
    }
}