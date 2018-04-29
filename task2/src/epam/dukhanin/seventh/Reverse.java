package epam.dukhanin.seventh;

public class Reverse {
    public static int reverseNumber(int a) {
        int reversedNumber = 0;
        while (a > 0) {
            reversedNumber = reversedNumber * 10 + a % 10;
            a = a / 10;
        }

        return reversedNumber;
    }
}
