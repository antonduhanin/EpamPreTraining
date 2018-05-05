package epam.dukhanin.fifth;

public class CountNumbers {
    private final static int DIGIT_NUMBER = 10;

    public static int multiplyNumbers(int a) {
        int firstDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int secondDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int thirdDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fourthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fifthDigit = a;
        return firstDigit * secondDigit * thirdDigit * fourthDigit * fifthDigit;
    }

    public static int addNumbers(int a) {
        int firstDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int secondDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int thirdDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fourthDigit = a % DIGIT_NUMBER;
        a /= DIGIT_NUMBER;
        int fifthDigit = a;
        return firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
    }

}
