package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("A").append("B").append("C").append("C").insert(4, "java").delete(4, 8).reverse().toString();
        System.out.println(str);

    }
}
