package loop;

public class DoWhile1 {
    public static void main(String[] args) {

        int i = 10;

        // do-while문은 최소 한번은 항상 실행된다.
        // 코드 블럭 실행 후 조건식을 검증, i=11이기 때문에 while문 조건식은 거짓이 된다. 따라서 do-while문 빠져나온다.
        do{
            System.out.println("현재 숫자는: " + i);
            i++;
        } while(i < 3);
    }
}
