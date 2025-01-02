package loop.sparta.array;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        // Queue: FIFO(선입선출)
        // add, peek, poll
        // Queue: 생성자가 없는 인터페이스 <-

        Queue<Integer> intQueue = new LinkedList<>(); // queue를 선언, 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println(intQueue.toString());

        while (!intQueue.isEmpty()) {
            // poll() : 대기열 헤드 제거 및 검색
            System.out.println(intQueue.poll());
        }

        System.out.println(intQueue.toString());

    }
}
