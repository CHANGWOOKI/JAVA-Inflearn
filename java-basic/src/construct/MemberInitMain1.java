package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 19;
        member1.grade = 80;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 19;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }


    }
}
