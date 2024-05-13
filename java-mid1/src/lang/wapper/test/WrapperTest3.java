package lang.wapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

        // Integer -> int
        //int intValue = integer1.intValue();   // 언박싱
        int intValue = integer1;    // 오토 언박싱
        System.out.println(intValue);

        // int -> Integer
        // Integer integer2 = Integer.valueOf(intValue);    // 박싱
        Integer integer2 = integer1;    // 오토 박싱
        System.out.println(integer2);
    }
}
