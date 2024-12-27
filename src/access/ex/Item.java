package access.ex;

public class Item {
    String item;
    int price;
    int quantity;

    public Item(String item, int price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return item;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
