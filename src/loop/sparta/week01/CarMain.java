package loop.sparta.week01;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();

        // 메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println(speed);

        boolean lights = car.onOffLights();
        System.out.println(lights);



    } //main 종료
}
