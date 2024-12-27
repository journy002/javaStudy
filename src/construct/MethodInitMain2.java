package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        // 생성자 공부

        MemberInit member1 = new MemberInit();
        memberInit(member1, "user1", 15, 70);

        MemberInit member2 = new MemberInit();
        memberInit(member2, "user2", 18, 90);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + "살, 성적: " + member.grade);
        }
    }

    static void memberInit(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
