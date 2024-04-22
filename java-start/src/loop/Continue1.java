package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i = 1,2,4,5 일 때 if이 실행 x
        // i = 3일 때 if 실행
        while (i <= 5) {

            if (i == 3) {
                i++;
                System.out.println(i);
            }

            System.out.println(i);
            i++;
        }
    }
}
