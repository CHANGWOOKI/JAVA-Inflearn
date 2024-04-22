package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String str;
        if (age >= 18) {
            str = "성인";
        } else {
            str = "미성년자";
        }

        System.out.println(str);
    }
}
