package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = "두부";
        productOrder.price = 2000;
        productOrder.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder[] productOrders = {productOrder, productOrder2};
        int totalPrice = 0;

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상품명: " + productOrders[i].productName + ", 가격: " + productOrders[i].price + ", 수량: " + productOrders[i].quantity);
            totalPrice += productOrders[i].price * productOrders[i].quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);

    }
}
