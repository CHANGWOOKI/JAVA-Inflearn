package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress address1 = new ImmutableAddress("서울"); // x001
        ImmutableAddress address2 = address1;   // x001

        System.out.println(address1);
        System.out.println(address2);

        address2 = new ImmutableAddress("부산");
        System.out.println(address1);
        System.out.println(address2);

    }
}
