package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 선언, 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println(sum);
        // 뺼셈
        int diff = a - b;
        System.out.println(diff);
        // 곱셈
        int multi = a * b;
        System.out.println(multi);
        // 나눗셈 (int 로 선언했기 때문에 몫만 나옴)
        int div = a / b;
        // double div = (double) a / b; 이렇게 하면 2.5로 나온다
        System.out.println(div);
        // 나머지  (나머지만 나옴)
        int mod = a % b;
        System.out.println(mod);

    }
}
