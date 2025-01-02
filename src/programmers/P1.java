package programmers;

public class P1 {
    public static void main(String[] args) {

        int n = 64;
        int k = 6;

        int foodFee = 12000;
        int beverageFee = 2000;
        int discount = (n/10) * 2000;

        int sum = 0;

        if (n >= 10) {
            n = n * foodFee;
            k = k * beverageFee - discount;
            sum = n + k;
        }

        System.out.println(sum);

    }
}
