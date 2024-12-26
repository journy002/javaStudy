package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student(); // x001; 참조값 생성
        student1.name = "학생1";
        student1.age = 14;
        student1.grade = 80;

        Student student2 = new Student(); // x002; 참조값 생성
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 90;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + "살 점수: " + students[i].grade);
        }

        System.out.println();
        // 향상된 for문
        System.out.println("향상된 For문 활용");
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + "살 점수: " + s.grade);
        }
    }
}
