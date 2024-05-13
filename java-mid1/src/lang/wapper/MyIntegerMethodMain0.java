package lang.wapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int target = 5;
        int result1 = compareTo(value, target);
        target = 11;
        int result2 = compareTo(value, target);
        target = 10;
        int result3 = compareTo(value, target);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3 );
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
