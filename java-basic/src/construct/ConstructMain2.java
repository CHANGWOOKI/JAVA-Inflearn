package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("김창욱", 29);
        MemberConstruct member2 = new MemberConstruct("김태강", 29, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(member.name + member.age + member.grade);
        }

    }
}
