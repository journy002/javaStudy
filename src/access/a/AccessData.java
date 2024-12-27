package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod: " + publicField);
    }

    public void publicMethod2() {
        System.out.println("publicMethod2: " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod: " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod: " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 10;
        defaultField = 20;
        privateField = 30;
        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
