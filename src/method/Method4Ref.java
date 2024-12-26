package method;

public class Method4Ref {
    public static void main(String[] args) {

        int num1 = 5;

        System.out.println("변경전 num1: " + num1);
        num1 = changeNum(num1); // changeNum에서 변경된 값을 num1에 다시 대입
        System.out.println("변경후 num1: " + num1);
    }

    public static int changeNum(int num2) {
        System.out.println("변경 전 num2: " + num2);
        num2 = num2 * 2;
        return num2;
    }
}
