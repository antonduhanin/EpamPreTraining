package epam.dukhanin.fifth;

public class CountNumbers {

    public static int multiplyNumbers(int a) {
        int result = 1;
        while (a > 0) {
            int oneDigitalNumberCurrent = a % 10;
            result *= oneDigitalNumberCurrent;
            a = a / 10;
        }
        return result;
    }

    public static int addNumbers(int a) {
        int result = 0;
        while (a > 0) {
            int oneDigitalNumberCurrent = a % 10;
            result += oneDigitalNumberCurrent;
            a = a / 10;
        }
        return result;
    }
}
