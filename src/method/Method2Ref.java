package method;

public class Method2Ref {
    public static void main(String[] args) {

        checkAge(18);
        checkAge(16);

    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자 입니다.");
        } else {
            System.out.println("성인 입니다.");
        }
    }
}
