package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) {
            sum = sum + i;
            if (sum > 100000) {
                System.out.
                        println("i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
