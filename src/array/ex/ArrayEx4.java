package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int arr = scanner.nextInt();

        int[] nums = new int[arr];

        System.out.println(arr + "개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {

            nums[i] += scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / arr;

        System.out.println("총 합: " + sum);
        System.out.println("평균: " + avg);
    }
}
