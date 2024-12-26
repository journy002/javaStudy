package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] scores = new int[3][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "번째 학생의 성적을 입력하세요. ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] += input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double avg = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
