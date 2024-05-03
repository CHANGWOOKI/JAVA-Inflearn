package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // 이후 부터는 컴파일 오류
        //data1 = 20;

        final int data2 = 10;
        // 이후 부터는 컴파일 오류
        //data2 = 20;
        method1(10);
    }

    static void method1(final int parameter) {
        // 10이라는 값이 들어왔기 때문에 20으로 변경 불가
        // parameter = 20;
    }

}
