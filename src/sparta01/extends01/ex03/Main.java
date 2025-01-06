package sparta01.extends01.ex03;

public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
    }
}
