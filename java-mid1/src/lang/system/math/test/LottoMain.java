package lang.system.math.test;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();

        int[] numbers = lotto.generator();
        Arrays.sort(numbers);
        System.out.print("로또 번호 : ");
        for (int number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }


    }
}
