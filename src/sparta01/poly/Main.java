package sparta01.poly;

import sparta01.poly.tire.HankookTire;
import sparta01.poly.tire.KiaTire;
import sparta01.poly.tire.Tire;

public class Main {
    public static void main(String[] args) {
        // 매개변수 다형성 확인
        Car car1 = new Car(new KiaTire("KIA"));
        Car car2 = new Car(new HankookTire("HANKOOK"));

        // 반환타입 다형성 확인
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();

        //
    }
}
