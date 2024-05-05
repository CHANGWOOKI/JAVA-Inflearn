package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new Emailsender(), new SmsSender(), new FaceBook()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다.");
        }
    }
}
