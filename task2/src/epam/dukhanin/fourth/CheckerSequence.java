package epam.dukhanin.fourth;

public class CheckerSequence {
    //return true if sequence is increase
    public static boolean increaseSequence(int a) {
        boolean increase = true;
        int oneDigitalNumberPreviously = 10;
        while (a > 0) {
            int oneDigitalNumberCurrent = a % 10;
            if (oneDigitalNumberPreviously != 10 && oneDigitalNumberPreviously < oneDigitalNumberCurrent) {
                increase = false;
            }
            oneDigitalNumberPreviously = oneDigitalNumberCurrent;
            a = a / 10;
        }
        return increase;
    }
}
