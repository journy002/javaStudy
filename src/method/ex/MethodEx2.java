package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        text("Hello world", 3);
        text("Hello world", 5);
    }

    public static void text(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
        System.out.println("끝");
    }
}
