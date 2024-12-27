package access;

public class SpeakerMain {
    public static void main(String[] args) {

        // 생성자를 통해 초기 음량 값 지정
        Speaker speaker = new Speaker(90);

        speaker.showVolumn();

        speaker.volumnUp();
        speaker.volumnUp();

        speaker.volumnDown();
        speaker.volumnDown();

        //필드에 직접 접근
        // System.out.println("volumn 필드 직접 접근 수정");
        // speaker.volumn = 200; // Speaker 클래스 volumn 멤버변수를 private로 변경하여 직접 수정하지 못하게 막음.
        // speaker.showVolumn();

    }
}
