package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {

        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        data.publicField = 11;
        data.publicMethod2();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        //내부 호출 가능
        data.innerAccess();
    }
}
