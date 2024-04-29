package task.oop;
public class Triangle extends Figure {


    public double perimeter(double x, double y) {
        double z = Math.sqrt((x*x) + (y*y));
        double perimeterResult = x + y + z;
        System.out.println("Периметр треугольника --> " + perimeterResult);
        return perimeterResult;
    }

    public double area(double x, double y) {
        double z = Math.sqrt((x*x) + (y*y));
        double perimeterResult = (x + y + z)/2;
        double areaResult = Math.sqrt(perimeterResult * (perimeterResult - x) * (perimeterResult - y) * (perimeterResult - z));
        System.out.println("Площадь треугольника --> " + areaResult);
        return areaResult;
    }
}
