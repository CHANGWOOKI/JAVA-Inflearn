package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java!";
        DecoUtil1 util1 = new DecoUtil1();
        String deco = util1.deco(s);

        System.out.println(s);
        System.out.println(deco);

    }
}
