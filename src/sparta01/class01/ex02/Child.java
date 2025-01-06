package sparta01.class01.ex02;

public class Child extends Parent{
    int b;

    Child() {
        super(40);
        b=20;
    }

    public void display() {
        System.out.println(b);
        System.out.println(super.a);
    }
}
