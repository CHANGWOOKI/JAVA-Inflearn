package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a;    // a(1)에 증가 하고 b에 a(2)를 대입 a=++(2), b=a(2)
        System.out.println(a);
        System.out.println(b);

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++;    // b에 a(1)를 대입하고, a를 증가 b=a(1), a=++ 2
        System.out.println(a);
        System.out.println(b);
    }
}