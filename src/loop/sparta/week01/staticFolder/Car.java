package loop.sparta.week01.staticFolder;

// [ 클래스를 만들기 위해서는 4가지 STEP이 필요하다. ]
// 1. 만들려고 하는 설계도를 선언(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정한다.
// 3. 객체를 생성하는 방식을 정의한다.(생성자)
// 4. 객체가 가지고 있어야할 행위(메서드)를 정희한다.

public class Car {
    // <필드 영역>

    // 1) 고유 데이터 영역
    static String company = "GENESIS";
    String model;
    String color;
    double price;

    // 2) 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

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

    String getCompany() {
        return "(주)" + company;
    }

    static String setCompany(String companyName) {
        company = companyName;
        return company;
    }
}
