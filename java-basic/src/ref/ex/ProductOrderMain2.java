package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품 수량을 입력해주세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번 째 주문을 시작합니다.");
            System.out.print("상품명을 입력해주세요 : ");
            String productName = scanner.nextLine();
            System.out.print("상품 가격을 입력해주세요 : ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("상품 수량을 입력해주세요 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createProduct(productName, price, quantity);
        }
        int totalAmount = getTotalAmount(productOrders);
        printOrders(productOrders);
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    public static ProductOrder createProduct(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명:" + productOrder.productName + " 가격:" + productOrder.price + " 수량:" + productOrder.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}