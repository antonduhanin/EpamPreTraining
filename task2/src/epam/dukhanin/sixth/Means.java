package epam.dukhanin.sixth;

public class Means {

    public static double findArithmeticMean(int a) {
        int countNumbers = 0;
        int sum = 0;
        while (a > 0) {
            countNumbers++;
            int oneDigitalNumberCurrent = a % 10;
            sum += oneDigitalNumberCurrent;
            a = a / 10;
        }
        return sum / countNumbers;
    }

    public static double findGeometricMean(int a) {
        int countNumbers = 0;
        int multiplication = 1;
        while (a > 0) {
            countNumbers++;
            int oneDigitalNumberCurrent = a % 10;
            multiplication *= oneDigitalNumberCurrent;
            a = a / 10;
        }
        return Math.pow(multiplication, 1.0 / countNumbers);
    }
}
