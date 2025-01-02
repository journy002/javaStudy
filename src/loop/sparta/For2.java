package loop.sparta;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 스캐너 값은 패스하고 다음으로 넘어가기
//        int pass = sc.nextInt();

//        for (int i = 1; i <= 9; i++) {
//            if (i == pass) {
//                continue;
//            }
//            for (int j = 0; j <= 9; j++) {
//                System.out.println(i + "*" + j + "= " + i * j);
//            }
//            System.out.println();
//        }

        // 스캐너로 받아온 값의 곱셈만 출력
        int fixNum = sc.nextInt();

        for (int i = fixNum; i <= 9 ; i++) {
            if (i == fixNum) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "= " + i*j);
                }
            }
        }
    }
}
