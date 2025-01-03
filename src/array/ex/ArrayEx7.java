package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int students = scanner.nextInt();

        int[][] scores = new int[students][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < students; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 성적: ");
                scores[i][j] += scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double avg = total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }

    }
}
