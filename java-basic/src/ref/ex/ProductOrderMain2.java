package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문 수량을 입력해주세요 : ");
        int productQuantity = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[productQuantity];


        for (int i = 0; i < productQuantity; i++) {
            System.out.println((i + 1) + "번 째 주문 정보를 입력하세요.");
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
