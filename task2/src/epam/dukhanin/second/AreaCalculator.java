package epam.dukhanin.second;

public class AreaCalculator {
    public static double calculateRingArea(double r1, double r2) {
        return calculateCircleArea(r1) - calculateCircleArea(r2);
    }

    public static double calculateCircleArea(double radius) {
        return radius * radius * Math.PI;
    }
}
