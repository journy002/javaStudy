package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        while(true) {
            System.out.print("문자 입력(exit: 종료): ");

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력한 문자: " + str);
        }
    }
}
