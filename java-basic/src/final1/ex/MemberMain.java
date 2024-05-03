package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "김창욱");
        member.print();
        member.changeData("kim");
        member.print();
    }
}
