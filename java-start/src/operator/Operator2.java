package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열 끼리 더할 수 있다
        // 문자열과 숫자를 더하면 숫자가 문자열로 변경된다.
        // 문자열과 문자열 더하기 1
        String result1 = "hello" + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String r1 = "hello";
        String r2 = "world";
        String result2 = r1 + r2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        String result3 = "r1 + r2 = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        String r4 = "r1 + r2 = ";
        int num1 = 10;
        String result4 = r4 + num1;
        // result4 = "r1 + r2 = " + "10"
        System.out.println(result4);
    }
}
