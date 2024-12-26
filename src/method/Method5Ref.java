package method;

public class Method5Ref {
    public static void main(String[] args) {

        // 명시적 형변환
        double number = 1.5;
        printNumber((int) number); // double -> int로 형 변환
    }

    public static void printNumber(int num) {
        System.out.println("숫자: " + num);
    }
}
