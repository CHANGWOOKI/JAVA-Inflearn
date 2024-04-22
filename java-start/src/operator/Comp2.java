package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        
        // 문자열은 == 연산자로 비교x equals로 하는게 정확하다
        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("hello");
        boolean result3 = str2.equals("world");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
