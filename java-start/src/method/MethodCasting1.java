package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(1.5);
        printNumber((int) number);  // double 을 int 로 강제 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
