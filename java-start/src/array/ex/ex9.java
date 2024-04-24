package array.ex;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);  // 정수
        Scanner scanner2 = new Scanner(System.in);  // 문자열

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int selectMenu = 0;
            selectMenu = scanner1.nextInt();
            System.out.println();

            switch (selectMenu) {
                case 1:
                    if (productCount >= maxProducts) {
                        System.out.println("상품을 더이상 등록할 수 없습니다. (최대 10개) ");

                        continue;
                    }
                    System.out.println("상품 등록");
                    System.out.print("상품명을 입력하세요 : ");
                    productNames[productCount] = scanner2.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner1.nextInt();

                    productCount++;

                    break;
                case 2:
                    System.out.println("상품 목록");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println("상품 이름 : " + productNames[i] + " , 상품 가격 : " + productPrices[i]);
                    }

                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 다시 입력하세요.");

                    break;
            }

        }
    }
}
