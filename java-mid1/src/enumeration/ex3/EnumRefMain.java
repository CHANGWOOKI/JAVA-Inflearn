package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());
        System.out.println();

        // toString() 오버라이딩 되어 있어 참조 값이 안나온다.
        System.out.println(Grade.BASIC);
        System.out.println(Grade.GOLD);
        System.out.println(Grade.DIAMOND);
        System.out.println();

        System.out.println(refValue(Grade.BASIC));
        System.out.println(refValue(Grade.GOLD));
        System.out.println(refValue(Grade.DIAMOND));


    }
    
    // 참조 값을 반환하는 로직
    private static String refValue(Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
}
