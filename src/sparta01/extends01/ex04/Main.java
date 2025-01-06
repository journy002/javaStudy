package sparta01.extends01.ex04;

public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.openDoor();
        gasCar.move();
        gasCar.fillUp();
    }
}
