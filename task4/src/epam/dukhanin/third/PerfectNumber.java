package epam.dukhanin.third;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int count = 0;//sum of multiplier

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }

        return count == number;
    }
}
