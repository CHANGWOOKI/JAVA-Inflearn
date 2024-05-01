package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(DecoData data) {
        // 정적 메서드에서 인스턴스 변수, 메서드 접근 불가
        // 정적 변수, 메서드만 접근 가능
        data.instanceValue++;    // 인스턴스 변수 접근, 컴파일 오류
        data.instanceMethod();   // 인스턴스 메서드 접근, 컴파일 오류

        staticValue++;  // static 변수 접근
        staticMethod(); // static 메서드 호출
    }

    public void instanceCall() {
        // 인스턴스 메서드에서 인스턴스 변수,메서드 정적 변수,메서드 호출 가능
        instanceValue++;   // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 호출

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
