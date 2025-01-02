package loop.sparta.array;

import java.util.HashSet;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

        // [Set(집합): 순서 없고, 중복 없음]
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 구조
        // Set -> 그냥 쓸 수도 있음. 그러나 HashSet, TreeSet 등으로 응용해서 같이 사용
        // Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음
        // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있음

        Set<Integer> intSet = new HashSet<>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        // 중복되는 "1"과 "12"는 For문을 돌렸을때 출력되지 않는다.
        for (Integer i : intSet) {
            System.out.println(i);
        }

        // contains : 요소를 검색하는데 사용된다.
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(12));

    }
}
