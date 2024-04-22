package variable.ex;

public class VarEx1 {
    public static void main(String[] args) {
        // 문제
        // 반복해서 나오는 숫자 4, 3 을 한번에 변경할수 있더도록 num1, num2를 사용해서 변경해보기
        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);
        System.out.println(4 / 3);

        // 답
        int num1 = 4;
        int num2 = 3;

        System.out.println(num1 - num2);
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
