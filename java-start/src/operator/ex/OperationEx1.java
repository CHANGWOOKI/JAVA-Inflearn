package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        // 10, 20, 30 을 각각 변숭에 저장하고 합과 평균 출력 (정수)
        int a = 10;
        int b = 20;
        int c = 30;

        int sum1 = a + b + c;
        int average1 = sum1 / 3;
        System.out.println(sum1);
        System.out.println(average1);

        // 1.5, 2.5, 3.5를 변수에 대입하고 합과 평균 출력 (실수)
        double z = 1.5;
        double x = 2.5;
        double v = 3.5;


        double sum2 = z + x + v;
        double average2 = sum2 / 3;
        System.out.println(sum2);
        System.out.println(average2);

    }
}
