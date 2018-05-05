package epam.dukhanin.fourth;

public class CheckerSequence {
    private final static int DIGIT_NUMBER = 10;

    //return true if sequence of 4 digit number is increase
    public static boolean increaseSequence(int a) {
        int oneDigitalNumberFirst = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int oneDigitalNumberSecond = a % DIGIT_NUMBER;
        if (oneDigitalNumberFirst < oneDigitalNumberSecond) {
            return false;
        }

        oneDigitalNumberFirst = oneDigitalNumberSecond;
        a /= DIGIT_NUMBER;
        oneDigitalNumberSecond = a % DIGIT_NUMBER;
        if (oneDigitalNumberFirst < oneDigitalNumberSecond) {
            return false;
        }

        oneDigitalNumberFirst = oneDigitalNumberSecond;
        a /= DIGIT_NUMBER;
        oneDigitalNumberSecond = a;
        if (oneDigitalNumberFirst < oneDigitalNumberSecond) {
            return false;
        }
        return true;
    }
}
