package loop.sparta.array;

import java.util.ArrayList;

public class ArrayList05 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");

        System.out.println(strList); // 출력값: [1,2,3,4,5]

        strList.set(2, "33");

        System.out.println(strList); // 출력값: [1,2,33,4,5]

    }
}
