package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumnUp();
        musicPlayer.volumnUp();
        musicPlayer.volumnUp();
        // 볼륨 감소
        musicPlayer.volumnDonw();
        // 상태 확인
        musicPlayer.showStatus();
        // 음악 플레이어 끄기
        musicPlayer.off();
    }
}
