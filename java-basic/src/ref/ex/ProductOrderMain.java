package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createProduct("두부", 2000, 2);
        productOrders[1] = createProduct("김치", 5000, 1);
        productOrders[2] = createProduct("콜라", 1500, 2);

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
