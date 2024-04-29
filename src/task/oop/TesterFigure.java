package task.oop;

import java.util.Scanner;

public class TesterFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру: Круг, Квадрат, Труегольник");
        String typeFigure = scanner.nextLine();
        Triangle trygolnik = new Triangle();
        Circle krug = new Circle();
        Square kvadr = new Square();
        switch (typeFigure) {
            case "Круг":
                System.out.println("Введите радиус ");
                int r = scanner.nextInt();
                double pi = Math.PI;
                krug.perimeter(r, pi);
                krug.area(r, pi);
                break;
            case "Треугольник":
                System.out.println("Введиите длину 3 катетов через Enter");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                trygolnik.perimeter(x, y);
                trygolnik.area(x, y);
                break;
            case "Квадрат":
                System.out.println("Введиите длину и ширину через Enter");
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                kvadr.perimeter(b, c);
                kvadr.area(b, c);
                break;
        }

    }

}
