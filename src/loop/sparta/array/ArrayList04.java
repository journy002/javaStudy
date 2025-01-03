package loop.sparta.array;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        strList.add("a");
        strList.add("p");
        strList.add("a");
        strList.add("t");

        // strList의 단일 요소 반환
        System.out.println(strList.get(0)); // 출력값: "a"
        System.out.println(strList.get(1)); // 출력값: "p"

        //strList[0] ~ strList[3] 범위 반환: 지정한 인덱스(4) -1로 끝난다.
        System.out.println(strList.subList(0, 4)); // 출력값: [a,p,a,t]
        System.out.println(strList.subList(1, 4)); // 출력값: [p,a,t]




    }
}
