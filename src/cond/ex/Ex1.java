package cond.ex;

public class Ex1 {
    public static void main(String[] args) {
        int price = 12000; //상품 가격
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        // else if문을 사용하면 첫 번째 조건을 만족하는 순간 조건문을 나오게 되어 두 번째 할인 혜택을 받지 못하는 상황이 발생한다.

        if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하 아동, 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount);
    }
}
