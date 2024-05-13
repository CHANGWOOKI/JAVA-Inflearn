package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "     Hello Java";

        String str = original.trim();
        //String str = original.strip();    // 동일

        System.out.println(str);
    }
}
