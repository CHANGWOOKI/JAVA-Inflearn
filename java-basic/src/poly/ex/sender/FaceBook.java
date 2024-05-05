package poly.ex.sender;

public class FaceBook implements Sender {
    @Override
    public void sendMessage(String str) {
        System.out.println("페메를 발송합니다. " + str);
    }
}
