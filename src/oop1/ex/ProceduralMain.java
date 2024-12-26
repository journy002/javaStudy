package oop1.ex;

public class ProceduralMain {
    public static void main(String[] args) {
        // 절차 지향 코드

        int witdh = 5;
        int height = 5;
        int area = calculateArea(witdh, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(witdh, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(witdh, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }


}
