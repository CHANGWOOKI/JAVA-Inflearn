package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruit = fruits.split(",");
        for (String str : fruit) {
            System.out.println(str);
        }
        String join = String.join("->", fruits);
        System.out.println(join);
    }
}