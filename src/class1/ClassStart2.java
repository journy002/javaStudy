package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 14;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 90;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + "살 점수: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + "살 점수: " + student2.grade);
    }
}
