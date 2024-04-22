package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 괄호가 우선 없으면 곱셉부터
        int sum1 = 1 + 2 * 3;   // 1 + (2 * 3);
        int sum2 = (1 + 2) * 3;
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
