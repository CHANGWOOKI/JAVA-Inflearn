package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount > 10) {
            System.out.println("상품은 총 10개만 저장 가능합니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItem() {
        System.out.println("장바구니 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + " 합계 : " + item.getTotalPrice());
        }
        System.out.println("총 합계 금액 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
