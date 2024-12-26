package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] nums = new int[count];
        int minNumber, maxNumber;

        System.out.println(count + "개의 정수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            nums[i] += scanner.nextInt();
        }

        minNumber = maxNumber = nums[0];

        for (int i = 0; i < count; i++) {
            if(nums[i] < minNumber) {
                minNumber = nums[i];
            }

            if(nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.print("가장 큰 정수: " + maxNumber);

    }
}
