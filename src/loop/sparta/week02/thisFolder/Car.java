package loop.sparta.week02.thisFolder;

// [ 클래스를 만들기 위해서는 4가지 STEP이 필요하다. ]
// 1. 만들려고 하는 설계도를 선언(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정한다.
// 3. 객체를 생성하는 방식을 정의한다.(생성자)
// 4. 객체가 가지고 있어야할 행위(메서드)를 정희한다.

public class Car {
    // <필드 영역>

    // 1) 고유 데이터 영역
    static final String COMPANY = "GENESIS";
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
    public Car(String model) {
        this(model, "Blue", 50000000);
    }

    public Car(String model, String color) {
        this(model, color, 700000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }




}
