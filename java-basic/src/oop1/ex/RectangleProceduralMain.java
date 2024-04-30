package oop1.ex;

import java.util.Scanner;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("가로 입력 : ");
        rectangle.width = scanner.nextInt();
        System.out.print("세로 입력 : ");
        rectangle.height = scanner.nextInt();

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean isSquare = rectangle.isSquare();

        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + perimeter);
        System.out.println("정상각형 여부 : " + isSquare);
    }

}
