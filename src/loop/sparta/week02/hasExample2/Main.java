package loop.sparta.week02.hasExample2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("G80", "White", 90000000);

        Tire[] tires = new Tire[]{
                new Tire("기아", 10000),new Tire("기아", 10000),
                new Tire("현대", 12000),new Tire("현대", 12000),
        };

//        // 자동차 객체에 부품 등록
//        car.setTire(tires);
//
//        //
//        for (Tire tire : car.tire) {
//            System.out.println(tire.company + ", " + tire.price);
//        }

//        System.out.println();

        for (Tire tire : tires) {
            System.out.println(tire.company + ", " + tire.price);
        }



    }
}
