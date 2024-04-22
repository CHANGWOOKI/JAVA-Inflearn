package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            System.out.println("i = " + i + " , sum = " + sum);

            if (sum > 100000) {
                System.out.println("처음으로 100,000인 넘는 i = " + i);
                break;
            }

            i++;
        }
    }
}
