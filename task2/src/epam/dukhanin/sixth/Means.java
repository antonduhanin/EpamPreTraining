package epam.dukhanin.sixth;

public class Means {
    private final static int DIGIT_NUMBER = 10;
    private final static int NUMBER_OF_DIGITS = 6;

    public static double findArithmeticMean(int a) {
        int firstDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int secondDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int thirdDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fourthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fifthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int sixthDigit = a;

        return (firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit + sixthDigit) / NUMBER_OF_DIGITS;
    }

    public static double findGeometricMean(int a) {
        int firstDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int secondDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int thirdDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fourthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fifthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int sixthDigit = a;

        return Math.pow(firstDigit * secondDigit * thirdDigit * fourthDigit * fifthDigit * sixthDigit, 1.0 / NUMBER_OF_DIGITS);
    }
}
