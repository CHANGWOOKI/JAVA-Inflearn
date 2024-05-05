package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.A();
        a.B();
        a.AAAA();

        InterfaceB b = new Child();
        b.A();
        b.B();
        b.BBBB();

        Child child = new Child();
        child.A();
        child.B();
        child.AAAA();
        child.BBBB();
    }
}
