package loop.sparta.array;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<>();

        intArr.add(1);
        intArr.add(2);
        intArr.add(3);

        intArr.remove(1); // 인덱스[1] 값을 제거

        System.out.println(intArr); // 출력 값: [1, 3]

        intArr.clear(); // intArr에 담겨져 있는 값 전부 제거
        System.out.println(intArr);
    }
}
