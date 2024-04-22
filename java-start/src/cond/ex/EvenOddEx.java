package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        //  숫자가 홀수면 홀수, 짝수면 짝수라고 출력
        int a = 10;
        String str = (a % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
    }
}
