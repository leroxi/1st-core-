public class Square extends Figure {


    public double perimeter(double b, double c) {
        double perimeterResult = (c + b) * 2;
        System.out.println("Периметр квадрата --> " + perimeterResult);
        return perimeterResult;
    }

    public double area(double b, double c) {
        double areaResult = b * c;
        System.out.println("Площадь квадрата --> " + areaResult);
        return areaResult;
    }
}
