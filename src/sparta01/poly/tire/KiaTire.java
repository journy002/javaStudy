package sparta01.poly.tire;

public class KiaTire extends Tire {

    public KiaTire(String company) {
        super(company);
    }

    @Override
    public void rideComfort() {
        System.out.println(super.company + " 타이어 승차감은 " + 60);
    }
}
