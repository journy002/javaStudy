package class1;

public class ClassStart1 {
    public static void main(String[] args) {

        String[] studentsName = {"학생1", "학생2"};
        int[] studentsAge = {15, 17};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("이름: " + studentsName[i] + " 나이: " + studentsAge[i] + " 점수: " + studentGrade[i]);
        }
    }
}
