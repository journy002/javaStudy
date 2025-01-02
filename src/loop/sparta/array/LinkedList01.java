package loop.sparta.array;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        // linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담는다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본적 기능 -> ArrayList와 동일
        // Linked list는 값 -> 여기 저기 나누어서 저장 : 조회하는 속도가 "느리다."
        // 값을 추가하거나, 삭제할 때는 "빠르다."

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.toString()); // 이렇게 조회할 때는 arraylist보다 속도가 느리다.

        linkedList.add(200);
        System.out.println(linkedList.toString()); // 조회할 때는 arraylist보다 속도가 느리다.

        linkedList.add(2, 4);
        System.out.println(linkedList.toString()); // 인덱스[2] 값을 4로 변경, 원래 인덱스[2]번에 있던 값은 [3]으로 밀림

        linkedList.set(2, 77);
        System.out.println(linkedList.toString());

        linkedList.remove(0);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());

    }
}
