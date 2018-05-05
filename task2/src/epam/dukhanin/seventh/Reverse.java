package epam.dukhanin.seventh;

public class Reverse {
    private final static int ONE_DIGIT = 10;
    private final static int TWO_DIGIT = 100;
    private final static int THREE_DIGIT = 1000;
    private final static int FOUR_DIGIT = 10_000;
    private final static int FIVE_DIGIT = 100_000;
    private final static int SIX_DIGIT = 1_000_000;

    public static int reverseNumber(int a) {
        int firstDigit = a % ONE_DIGIT;
        int result = firstDigit * SIX_DIGIT;
        a /= ONE_DIGIT;

        int secondDigit = a % ONE_DIGIT;
        result += secondDigit * FIVE_DIGIT;
        a /= ONE_DIGIT;

        int thirdDigit = a % ONE_DIGIT;
        result += thirdDigit * FOUR_DIGIT;
        a /= ONE_DIGIT;

        int fourthDigit = a % ONE_DIGIT;
        result += fourthDigit * THREE_DIGIT;
        a /= ONE_DIGIT;

        int fifthDigit = a % ONE_DIGIT;
        result += fifthDigit * TWO_DIGIT;
        a /= ONE_DIGIT;

        int sixthDigit = a % ONE_DIGIT;
        result += sixthDigit * ONE_DIGIT;
        a /= 10;

        result += a;

        return result;
    }
}
