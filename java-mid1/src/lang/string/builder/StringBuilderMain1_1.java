package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder();
        sd.append("A");
        sd.append("B");
        sd.append("C");
        sd.append("D");
        sd.append("E");
        sd.append("F");
        sd.append("G");
        System.out.println(sd);

        sd.insert(4, "java");
        System.out.println(sd);

        sd.delete(4, 5);
        System.out.println(sd);

        sd.reverse();
        System.out.println(sd);

        String str = sd.toString();

        System.out.println(str);

        String str1 = str.concat("Abbbb");

        System.out.println(str1);

    }
}
