package loop.sparta.array;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {

        ArrayList<Integer> intArrList = new ArrayList<>();

        intArrList.add(3);
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(3);

        // intArrList에 값이 비어있으면 true를 반환, 값을 담고 있다면 false 반환
        System.out.println(intArrList.isEmpty()); // 출력값: false

        // intArrList에 3 이 있는지 검색
        System.out.println(intArrList.contains(3)); // 출력값: true

        // intArrList에 3이 있는지 순차적으로 검색 후 index 반환
        System.out.println(intArrList.indexOf(3)); // 출력값: 0

        // intArrList에 3이 있는지 역순으로 검색 후 index 반환
        System.out.println(intArrList.lastIndexOf(3)); // 출력값: 3

    }
}
