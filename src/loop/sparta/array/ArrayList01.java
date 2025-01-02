package loop.sparta.array;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> intList = new ArrayList<>(); // 선언 + 생성;

        intList.add(99);
        intList.add(15);
        intList.add(1);

        //System.out.println(intList.get(1));

        // 2번째 값 10으로 변경
        //intList.set(1, 10);
        //System.out.println(intList.get(1));


        // System.out.println(intList.get(0)); // 99
        //삭제
        intList.remove(0);
        // System.out.println(intList.get(0)); // 15 => remove() 실행하면 인덱스 0번째 값이 사라지고 인덱스 1번 값이 밀려서 0번 자리로 온다.

        // list 전체값 삭제 => clear();

        System.out.println("Clear 전: " + intList.toString()); // [15, 1]
        intList.clear();
        System.out.println("Clear 후: " + intList.toString()); // []

    }
}
