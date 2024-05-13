package lang.system.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] numbers;
    private int count;

    public int[] generator() {
        numbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않는 경우에만 배열에 추가
            if (isUnique(number)) {
                numbers[count] = number;
                count++;
            }
        }
        return numbers;
    }


    // 이미 생성된 번호와 중복 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}