package gen;

// 1. 제네릭은 클래스 또는 메서드에 사용 가능!
// <> 안에 들어가야 할 타입을 명시 => 이 클래스에는 //4. 하단에 Generic <String>이라고 적어서 "T" 의 타입이 "String"이 된다.
// 때문에, T의 타입은 String 타입으로 적용된다.
// T라고 적어주는건 하나의 convention(관습)이다.

public class Generic<T> {
    // 2. 내부 필드에 String
    private T t;

    // 3. method return type도 String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();
        System.out.println(tValueTurnOutWithString);
    }
}
