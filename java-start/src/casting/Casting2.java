package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;

        //int intValue = doubleValue; 컴파일 오류
        int intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
