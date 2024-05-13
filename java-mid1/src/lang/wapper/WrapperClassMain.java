package lang.wapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);   // 미래에 삭제 예정, 대신에 valueOf() 사용
        Integer i2 = Integer.valueOf(10);   // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long l = Long.valueOf(100);
        Double d = Double.valueOf(101.1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l);
        System.out.println(d);

        int i = i1.intValue();
        System.out.println(i);
        long l1 = l.longValue();
        System.out.println(l1);

        System.out.println("비교");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}