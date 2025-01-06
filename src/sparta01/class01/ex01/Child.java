package sparta01.class01.ex01;

public class Child extends Parent{
    int a = 20;

    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
