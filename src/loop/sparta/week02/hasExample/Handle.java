package loop.sparta.week02.hasExample;

public class Handle {
    String company;
    String type; // 핸들 타입

    public Handle(String company, String type) {
        this.company = company;
        this.type = type;
    }

    public void turnHandle(String direction) {
        System.out.println(direction + " 방향으로 핸들을 돌립니다.");
    }
}
