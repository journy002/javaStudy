package construct;

public class MemberConstruct {
    // 멤버 변수
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//        변경
        this(name, age, 50); // this()를 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
    }

    // 생성자
    MemberConstruct (String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
