package loop.sparta.array;

public class Arr02 {
    public static void main(String[] args) {

        // 가변 변수

        int[][] intArr = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        intArr[0] = new int[2];
        intArr[1] = new int[4];
        intArr[2] = new int[1];

        // 중괄호로 바로 초기화 가능
        int[][] intArr2 = {
                {10, 20,},
                {10,20,30,40,},
                {10}
        };

    }
}
