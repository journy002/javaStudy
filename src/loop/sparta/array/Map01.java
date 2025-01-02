package loop.sparta.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
        // Map: key - value pari -> 중요!!
        // key라는 값으로 unique하게 보장이 돼야 함(key값은 중복되면 안됌)
        // Map -> HashMap, TreeMap으로 으용

        Map<String, Integer> intMap = new HashMap<>();

        // key값, value값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key
        intMap.put("삼", 15); // 중복 key

        // keySet(): String형, values(): Int형
        // value() 메서드를 사용해서 출력시 중복되는 값이 있다면 처음 중복된 값은 없어지만 마지막 남은 값이 출력된다.
        for (Integer value : intMap.values()) {
            System.out.println(value);
        }

        Set<String> keySet = intMap.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + intMap.values());
        }
    }
}
