package sparta01.poly.tire;

public class HankookTire extends Tire{

    public HankookTire(String company) {
        super(company);
    }

    @Override
    public void rideComfort() {
        System.out.println(super.company + "타이어 승차감은 " + 100);
    }
}
