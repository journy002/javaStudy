package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(1000, balance);
        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: " + balance);

    }

    public static int deposit(int deposit, int balance) {
         balance += deposit;
         System.out.println(deposit + "원을 입금하셨습니다. 현재 잔액: " + balance);
         return balance;
    }

    public static int withdraw(int withdraw, int balance) {
        balance -= withdraw;
        System.out.println(withdraw + "원을 출금하셨습니다. 현재 잔액: " + balance);
        return balance;
    }
}
