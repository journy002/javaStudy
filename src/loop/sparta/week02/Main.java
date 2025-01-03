package loop.sparta.week02;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // 같은 값이 나와야 지역변수로의 역할을 충실히 하는 것.
        // 지역변수이기 때문에 실행->종료, 실행->종료를 반복
        System.out.println(main.getNumber()); // 2
        System.out.println(main.getNumber()); // 2


    }

    // 메서드
    public int getNumber() {
        // 지역변수
        // 해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1;
        return number;
    }
}
