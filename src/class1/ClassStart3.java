package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1 = new Student(); // x001; 참조값 생성
        student1.name = "학생1";
        student1.age = 14;
        student1.grade = 80;

        Student student2 = new Student(); // x002; 참조값 생성
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 90;

        Student[] students = new Student[2];
        students[0] = student1; // x001 참조값 대입
        students[1] = student2; // x002 참조값 대입

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + "살 점수: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + "살 점수: " + students[1].grade);

    }
}
