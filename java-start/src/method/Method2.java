package method;

public class Method2 {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(4, 5);
        System.out.println("sum1 = " + sum1);

        // 계산 2
        int sum2 = add(20, 30);
        System.out.println("sum2 = " + sum2);

    }

    public static int add(int a, int b) {
        System.out.println(a + " + " + b + "연산수행");
        int sum = a + b;
        return sum;
    }

}
