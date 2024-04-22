package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // a=10, b=20 삼항 연사자 사용해서 더 큰 숫자 출력 되게 한다.
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);
    }
}
