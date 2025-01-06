package sparta01.extends01.super01;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call() {
        System.out.println("this value= " + this.value);
        System.out.println("super value= " + super.value);

        hello();
        super.hello();
    }
}
