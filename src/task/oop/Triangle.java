import java.util.Scanner;

public class Triangle extends Figura {

    public int perimetr(int x, int y, int z) {
        int pe = x + y + z;
        System.out.println("Периметр треугольника --> " + pe);
        return pe;
    }

    public double ploshad(int x, int y, int z) {
        double pe = (x + y + z)/2;
        double plo = Math.sqrt(pe * (pe - x) * (pe - y) * (pe - z));
        System.out.println("Площадь треугольника --> " + plo);
        return plo;
    }
}
