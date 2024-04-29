package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.count);  // 0
        System.out.println(bigData.data);   // null

        // NullPorinterException 예외 발생
        // bigData = null 이므로 null에 data를 찾는경우이다.
        System.out.println(bigData.data.value);
    }
}
