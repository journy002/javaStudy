package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {

            nums[i] += scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / nums.length;

        System.out.println("총 합: " + sum);
        System.out.println("평균: " + avg);
    }
}
