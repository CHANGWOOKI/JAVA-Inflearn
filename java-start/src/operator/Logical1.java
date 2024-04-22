package operator;

public class Logical1 {
    public static void main(String[] args) {
        // &&(and), ||(or), !(부정)
        System.out.println("&&: AND 연산자");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산자");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 부정 연산자");
        System.out.println(!true);
        System.out.println(!false);

        // 변수 활용
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
