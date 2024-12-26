package oop1.ex;

public class ProceduralMain2 {
    public static void main(String[] args) {
        // 객체 지향 코드

        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculateArea(5, 5);
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter(5, 10);
        System.out.println("둘례: " + perimeter);
        boolean square = rectangle.isSquare(5, 8);
        System.out.println("정사각형 여부: " + square);
    }
}
