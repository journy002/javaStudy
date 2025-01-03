package loop.sparta.week01.parameter;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.company = "현대";
        System.out.println(car.company);
        System.out.println(car.model);

        double speed = car.gasPedal(50, 'D');
        System.out.println("speed= " + speed + ", gear= " + car.gear);

        car.brakePedal();
        System.out.println("speed= " + car.speed + ", gear= " + car.gear);

        System.out.println(car.onOffLights());
        System.out.println(car.onOffLights());
    }
}
