package programmers;

public class P2 {
    public static void main(String[] args) {
        // 문자열 뒤집기

        String myString = "jaron";

        // 첫번째 방법
        StringBuilder str = new StringBuilder(myString);

        str.reverse();

        System.out.println(str);
        System.out.println(str.getClass());
        System.out.println(str.toString().getClass());

        // 두번째 방법
        String answer = "";
        for (int i = myString.length()-1; i >= 0; i--) {
            answer += myString.charAt(i);
        }

        System.out.println(answer);

    }
}
