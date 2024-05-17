package enumeration.test.ex2;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("HTTP CODE : ");
            int httpCodeInput = scanner.nextInt();
            scanner.nextLine();

            // 종료 로직
            if (httpCodeInput == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            HttpStatus status = HttpStatus.findByCode(httpCodeInput);
            if (status == null) {
                System.out.println("정의되지 않은 코드");
            } else {
                System.out.println(status.getCode() + " " + status.getMessage());
                System.out.println("isSuccess = " + status.isSuccess());
            }
        }
    }
}
