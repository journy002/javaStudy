package loop.sparta.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList06 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("5");

        for (int i = 0; i < strList.size(); i++) {
            System.out.println("for: "+strList.get(i));
        }

        Iterator<String> iter = strList.iterator();

        while (iter.hasNext()) {
            System.out.println("iter: "+iter.next());
        }

    }
}
