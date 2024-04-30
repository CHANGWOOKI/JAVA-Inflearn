package access;

public class Speaker {
    private int volume;

    public Speaker() {
    }

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 볼륨입니다.");
        } else {
            volume += 10;
            System.out.println("음량이 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("최저 볼륨입니다.");
        } else {
            volume -= 10;
            System.out.println("음량이 10 감소합니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 볼륨 " + volume);
    }
}