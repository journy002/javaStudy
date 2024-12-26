package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxCount = 10;

        String[] productNames = new String[maxCount];
        int[] productPrice = new int[maxCount];
        int productCount = 0;

        while(true) {

            System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount > maxCount) {
                    System.out.println("상품 등록 갯수가 초과했습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrice[productCount] = scanner.nextInt();

                productCount++;
            }

            if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrice[i]);
                }
            }

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        } //while문 종료
    }
}
