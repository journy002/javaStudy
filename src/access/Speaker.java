package access;

public class Speaker {
    private int volumn; // 필드

    Speaker(int volumn) {
        this.volumn = volumn;
    }

    void volumnUp() {
        if (volumn >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volumn += 10;
            System.out.println("볼륨 10증가: " + volumn);
        }
    }

    void volumnDown() {
        volumn -= 10;
        System.out.println("볼륨 10감소: " + volumn);
    }

    void showVolumn() {
        System.out.println("현재 음량: " + volumn);
    }
}
