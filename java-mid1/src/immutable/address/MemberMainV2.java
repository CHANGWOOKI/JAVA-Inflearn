package immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println(address);
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원B 주소 부산으로 변경
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println(memberA.getAddress());
        System.out.println(memberB.getAddress());
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


    }
}
