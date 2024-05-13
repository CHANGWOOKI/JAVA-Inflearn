package lang.wapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
