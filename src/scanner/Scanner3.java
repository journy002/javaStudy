package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.print("첫 번째 숫자가 큽니다: " + num1);
        } else if (num1 < num2) {
            System.out.print("두 번째 숫자가 큽니다: " + num2);
        } else {
            System.out.println("두 숫자의 크기가 같습니다.");
        }
    }
}
