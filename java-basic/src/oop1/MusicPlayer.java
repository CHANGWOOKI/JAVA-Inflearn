package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    // 전원 켜긱
    void on() {
        isOn = true;
        System.out.println("음악 플레이어 실행합니다.");
    }

    // 전원 끄기
    void off() {
        isOn = false;
        System.out.println("음악 플레이어 종료합니다. ");
    }

    // 볼륨 증가
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    // 볼륨 감소
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    // 음악 플레이어 상태
    void showStatus() {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
