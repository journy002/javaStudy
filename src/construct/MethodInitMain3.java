package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        // 생성자 공부

        MemberInit member1 = new MemberInit();
        member1.memberInit("user1", 17, 80);

        MemberInit member2 = new MemberInit();
        member2.memberInit("user2", 19, 90);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + "살, 성적: " + member.grade);
        }
    }
}
