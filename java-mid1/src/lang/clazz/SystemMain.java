package lang.clazz;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano : " + currentTimeNano);

        // 환경 변수를 막는다.
        System.out.println("getEnv : " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties : " + System.getProperties());
        System.out.println("java version : " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        char[] b = new char[5];
        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println("b : " + b); // 참조 값
        System.out.println("b : " + Arrays.toString(b));    // 배열을 출력한다.

        // 프로그램 종료
        System.exit(0);
    }
}
