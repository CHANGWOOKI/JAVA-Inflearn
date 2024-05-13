package lang.wapper;

public class WrapperVsPrimitive1 {
    public static void main(String[] args) {
        int iterations = 1000000000; // 반복 횟수 _ 는 단위 구분 자바에서 지원
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("걸린 시간 : " + (endTime - startTime));
        System.out.println("sumPrimitive" + sumPrimitive);

        // 래퍼형 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("걸린 시간 : " + (endTime - startTime));
        System.out.println("sumWrapper : " + sumWrapper);
    }
}
