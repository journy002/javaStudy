package oop1.ex2;

public class Account {

    int balance = 0; //잔액

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 금액: " + amount + "원, 잔고: " + balance);
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("출금 금액: " + amount + "원, 잔고: " + balance);
        }
    }
}
