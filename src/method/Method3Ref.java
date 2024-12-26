package method;

public class Method3Ref {
    public static void main(String[] args) {

        int num1 = 5;

        System.out.println("변경전 num1: " + num1);
        changeNum(num1);
        System.out.println("변경후 num1: " + num1);
    }

    public static void changeNum(int num2) {
        System.out.println("변경 전 num2: " + num2);
        num2 = num2 * 2;
        System.out.println("변경 후 num2: " + num2);
    }
}
