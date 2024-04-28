public class Circle extends Figure {


    public double perimeter(double r, double pi) {
        double perimeterResult = 2 * r * pi;
        System.out.println("Длина окружности --> " + perimeterResult);
        return perimeterResult;
    }

    public double area(double r, double pi) {
        double areaResult = pi * r * r;
        System.out.println("Площадь круга --> " + areaResult);
        return areaResult;
    }
}
