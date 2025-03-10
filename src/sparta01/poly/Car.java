package sparta01.poly;

import sparta01.poly.tire.HankookTire;
import sparta01.poly.tire.KiaTire;
import sparta01.poly.tire.Tire;

public class Car {
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}
