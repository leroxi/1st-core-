import java.util.Scanner;

public class Circle extends Figura {


    public double perimeter(int r, double pi) {
        double per = 2 * r * pi;
        System.out.println("Длина окружности --> " + per);
        return per;
    }

    public double ploshad(int r, double pi) {
        double plosh = pi * r * r;
        System.out.println("Площадь круга --> " + plosh);
        return plosh;
    }
}