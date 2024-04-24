package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // 향상된 for문 for-each문
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        // for-each 문이 사용할 수 없는 경우, 증가한은 index 값이 필요할떄
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("인덱스 i = " + i + "number = " + numbers[i]);

        }
    }
}
