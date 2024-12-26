package oop1;

public class MusicPlayer {
    int volumn;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어 ON");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumnUp() {
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);
    }

    void volumnDonw() {
        volumn--;
        System.out.println("음악 플레이어 볼륨: " + volumn);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON. 볼륨: " + volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
