import java.util.Scanner;

public class Square extends Figura {


    public int perimetr(int b, int c) {
        int p = (c + b) * 2;
        System.out.println("Периметр квадрата --> " + p);
        return p;
    }

    public int ploshad(int b, int c) {
        int pl = b * c;
        System.out.println("Площадь квадрата --> " + pl);
        return pl;
    }
}