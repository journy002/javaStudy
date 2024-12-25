package loop.ex;

public class WhileAndForEx {
    public static void main(String[] args) {

        int i = 1;

        System.out.println("While Test");
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------");

        System.out.println("For Test");

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
