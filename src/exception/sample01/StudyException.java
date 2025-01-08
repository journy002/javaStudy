package exception.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally

        // 일단 try 하고, 예외 발생하면 그걸 잡아(catch)
        // 그리고, 정상적으로 수행되든, 예외가 발생하든 결국, 마침내 수행돼야 하는 로직을 'finally' 수행해

        try {
            // 일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            // 무조건 여기는 실행 됌
            System.out.println("방금 예외 handling 했습니다. 정상처리, 예외처리 상관없이 실행");
        }


    }
}
