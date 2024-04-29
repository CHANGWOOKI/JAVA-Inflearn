package ref;

public class Nullmain1 {
    public static void main(String[] args) {
        Data d1 = null;
        System.out.println(d1);
        d1 = new Data();
        System.out.println(d1);
        d1 = null;
        System.out.println(d1);
    }
}
