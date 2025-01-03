package loop.sparta.week02.thisFolder;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("Gv60");
        System.out.println(Car.COMPANY);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println();

        Car car2 = new Car("Gv70", "Red");
        System.out.println(Car.COMPANY);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.price);
        System.out.println();

        Car car3 = new Car("Gv80", "DarkBlue", 100000000);
        System.out.println(Car.COMPANY);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.price);





    } //main 종료
}
