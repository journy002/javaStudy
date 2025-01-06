package sparta01.extends01.ex04;

public class ElectricCar extends Car{

    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("전기차가 빠르게 움직입니다.");
    }
}
