package loop.sparta;

import java.util.Arrays;

public class For1 {
    public static void main(String[] args) {

        int[] intArr = new int[3];

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("Arrays.fill() 기능 사용");

        Arrays.fill(intArr, 3);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

    }
}
