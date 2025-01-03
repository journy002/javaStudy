package loop.sparta.array;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Collection");
        String option = sc.nextLine();
        System.out.println("title");
        String title = sc.nextLine();

        switch (option) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();

                while (true) {
                    String text = sc.nextLine();

                    if (Objects.equals(text, "끝")) {
                        break;
                    }

                    strList.add(text);
                }

                System.out.println("[ List로 저장된 " + title + " ]");

                for (int i = 0; i < strList.size(); i++) {
                    int num = i + 1;
                    System.out.println(num + ". " + strList.get(i));
                }
                break;

            case "Set":
                Set<String> strSet = new HashSet<>();

                while (true) {
                    String text = sc.nextLine();

                    if (Objects.equals(text, "끝")) {
                        break;
                    }

                    strSet.add(text);
                }

                System.out.println("[ Set으로 저장된 " + title + " ]");

                Iterator<String> iterator = strSet.iterator();

                for (int i = 0; i < strSet.size(); i++) {
                    System.out.println(i+1 + ". " + iterator.next());
                }
                break;

            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int num = 1;

                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(num++, text);
                }

                System.out.println("[ Map으로 저장된 " + title + " ]");

//                for (String value : strMap.values()) {
//                    System.out.println(value);
//                }

                strMap.forEach((key, value) -> {
                    System.out.println(value);
                });
                break;
            default:
                System.out.println("잘못된 값을 입력하셨습니다.");
        } // switch 종료
    }
}
