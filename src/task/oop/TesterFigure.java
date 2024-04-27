import java.util.Scanner;

public class TesterFigure {
    public static void main(String[] args) {
        Triangle a = new Triangle();
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
                krug.ploshad(r, pi);
                break;
            case "Треугольник":
                System.out.println("Введиите длину 3 катетов через Enter");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                trygolnik.perimetr(x, y, z);
                trygolnik.ploshad(x, y, z);
                break;
            case "Квадрат":
                System.out.println("Введиите длину и ширину через Enter");
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                kvadr.perimetr(b, c);
                kvadr.ploshad(b, c);
                break;
        }

    }

}
