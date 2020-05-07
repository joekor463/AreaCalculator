//package Math;
public class AreaCalculator {
    private static double radius;

    public static void main (String args[]) {

        double result = Area(-1);
        System.out.println(result);

        double result1 = Area(5.0);
        System.out.println(result1);

        double result2 = Area(5.0, 4.0);
        System.out.println(result2);

        double result3 = Area(-1.0, 4.0);
        System.out.println(result3);
    }
    public static double Area (double radius){
        AreaCalculator.radius = radius;
        if (radius <= 0) {
            return -1.0;
        }

        return Math.PI*(radius * radius);
    }

    public static double Area (double x, double y){
        if ((x <= 0) || (y <= 0)) return -1.0;
        double Area = x * y;
        return Area;
    }
}

