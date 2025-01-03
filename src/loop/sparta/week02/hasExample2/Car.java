package loop.sparta.week02.hasExample2;

public class Car {

    static final String COMPANY = "GENESIS";
    String model;
    String color;
    double price;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    Tire[] tire;
    Door[] door;
    Handle handle;

    public void setTire(Tire ... tire) {
        this.tire = tire;
    }

    public void setDoor(Door... door) {
        this.door = door;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

}
