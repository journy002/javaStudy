package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum1 = add(5, 10);
        System.out.println(sum1);

    }

    // add method
    public static int add(int a, int b) {
        System.out.print(a + " + " + b + " 연산 수행: ");
        int sum = a + b;
        return sum;
    }
}
