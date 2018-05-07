package epam.dukhanin.third;

public class PerfectNumber {

    public static boolean isPerfectNumber(int a) {
        int count = 0;//sum of multiplier
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count += i;
            }
        }
        if (count == a) {
            return true;
        }
        return false;
    }
}
