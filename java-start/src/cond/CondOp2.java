package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String str = (age >= 18) ? "성인" : "미성년자";   // 조건 ? 참 표현식 : 거짓 표현식
        System.out.println(str);
    }
}
