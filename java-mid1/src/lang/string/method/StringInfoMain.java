package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println(str.length());   // 문자열의 길이
        System.out.println(str.isEmpty());  // 문자열이 비어 있는지
        System.out.println(str.isBlank());  // 문자열이 비어 있거나 공백인지

        char c = str.charAt(7);
        System.out.println(c);  // n번 인덱스 문자(7번)
    }
}
