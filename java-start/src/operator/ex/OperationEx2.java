package operator.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        // 점수가 80이고 80점이상 100 이하는 true 나오게
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
