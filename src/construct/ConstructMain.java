package construct;

public class ConstructMain {
    public static void main(String[] args) {
        //생성자
        //생성자는 인스턴스를 생성하고 즉시 호출된다.

        MemberConstruct member1 = new MemberConstruct("user1", 23, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 24, 80);
        MemberConstruct member3 = new MemberConstruct("user3", 22); //추가

        MemberConstruct[] members = {member1, member2, member3};

        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성적: " + m.grade);
        }

    }
}
