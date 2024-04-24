package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int totalprice = 0;
        int sum = 0;

        while (true) {
            System.out.println("1. 상품입력, 2. 결제, 3. 프로그램 종료");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("상품명을 입력하세요 : ");
                    String name = scanner.nextLine();

                    System.out.println("상품 가격을 입력하세요 : ");
                    int price = input.nextInt();

                    System.out.println("구매 수량을 입력하세요 : ");
                    int number = input.nextInt();

                    System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + number + ", 합계 : " + price * number);
                    totalprice = totalprice + price * number;

                    break;
                case 2:
                    System.out.println("총 비용 : " + totalprice);
                    totalprice = 0;

                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
