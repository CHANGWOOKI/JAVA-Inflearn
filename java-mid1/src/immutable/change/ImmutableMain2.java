package immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj immutableObj1 = new ImmutableObj(10);
        immutableObj1.add(20);

        immutableObj1.add(30);

        System.out.println(immutableObj1.getValue());
    }
}
