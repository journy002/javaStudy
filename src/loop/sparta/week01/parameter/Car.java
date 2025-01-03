package loop.sparta.week01.parameter;

import loop.sparta.week01.Door;
import loop.sparta.week01.Handle;
import loop.sparta.week01.parameter.Tire;

public class Car {
    // <필드 영역>

    // 1) 고유 데이터 영역
    String company;
    String model = "Gv80";
    String color;
    double price;

    // 2) 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = false;

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // <생성자 영역>
    // 생성자: 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {

    }

    // <메서드 영역>

    // gasPedal
    // input: km/h
    // return: speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    // breakPedal
    // input: x
    // output: speed
    double brakePedal() {
        changeGear('P');
        speed = 0;
        return speed;
    }

    // chageGear
    // input : gear(char type)
    // output : gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x
    // output : lights(boolean)
    boolean onOffLights() {
        lights = !lights;
        if (lights == true) {
            System.out.println("light가 켜졌습니다.");
        } else {
            System.out.println("light가 꺼졌습니다.");
        }
        return lights;
    }

    // horn
    // input : x
    // output : x
    void horn() {
        System.out.println("빵빵!");
    }

    // 자동차 속도 .. 가변길이 메서드
    void carSpeed(double... speeds) {
        for (double v : speeds) {
            System.out.println("v= " + v);
        }
    }
}
