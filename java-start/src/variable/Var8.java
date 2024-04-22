package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte a = 127;   // 2^8
        short b = 11111;    // 2^16
        int c = 111111111;  // 2^32 (기본으로 사용)
        // long 타입은 L을 뒤에 붙인다 소문자 아닌 L로 규칙(약속)
        long d = 111111111111111L;  // 2^64

        // 실수
        float e = 10.1f;    // 2^32
        double f = 10.222222;   // 2^64 (기본으로 사용)

        // 불리언
        // 불리언
        boolean g = false;  // true, false
    }
}
