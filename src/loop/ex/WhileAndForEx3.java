package loop.ex;

public class WhileAndForEx3 {
    public static void main(String[] args) {

        int sum = 0;
        int max = 100;

        System.out.println("max= " + max);

        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
