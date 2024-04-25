package method.ex;

public class ex {
    public static void main(String[] args) {
        System.out.println("평균값 : " + average(1, 2, 3));
        System.out.println("평균값 : " + average(4, 5, 3));
    }


    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }

}
