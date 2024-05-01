package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        DecoData data = new DecoData();
        System.out.println("1. 정적 호출");
        DecoData.staticCall(data);

        System.out.println("2. 인스턴스 호출");
        data.instanceCall();
        DecoData.staticCall(data);
        DecoData.staticCall(data);
        DecoData.staticCall(data);
        DecoData.staticCall(data);
    }
}
