package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int maxCount = 0;

    public void addItem(Item item) {
        if (maxCount > items.length) {
            System.out.println("장바구니 초과");
            return;
        }

        items[maxCount] = item;
        maxCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 출력");
        for (int i = 0; i < maxCount; i++) {
            Item item = items[i];
            System.out.println("제품: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
    }

    public void getTotalPrice() {
        int totalAcount = 0;
        for (int i = 0; i < maxCount; i++) {
            totalAcount += items[i].price * items[i].quantity;
        }
        System.out.println("총 금액: " + totalAcount);
    }

}
