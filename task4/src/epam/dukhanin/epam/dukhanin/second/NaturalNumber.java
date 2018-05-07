package epam.dukhanin.epam.dukhanin.second;

public class NaturalNumber {
    private final static int ONE_DIGIT = 10;
    private final static int NOT_PRIME_NUMBER = 1;

    public static int findBiggestDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            int lastDigit = number % ONE_DIGIT;
            if (maxDigit < lastDigit) {
                maxDigit = lastDigit;
            }
            number = number / 10;
        }
        return maxDigit;
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        while (temp > 0) {
            int lastDigit = temp % ONE_DIGIT;
            reverseNumber = reverseNumber * ONE_DIGIT + lastDigit;
            temp /= ONE_DIGIT;
        }
        return number == reverseNumber;
    }

    public static boolean isPrime(int number) {
        if (number == NOT_PRIME_NUMBER) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findGreatestCommonDivisor(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static int findLeastCommonMultiple(int a, int b) {
        int gcd = findGreatestCommonDivisor(a, b);
        int lcm = (a * b) / gcd;
        return lcm;
    }

    public static int findCountDifferentDigits(int a) {

        boolean one, two, three, four, five, six, seven, eight, nine, zero;
        one = two = three = four = five = six = seven = eight = nine = zero = false;
        boolean different = true;
        int numberDifferentNumbers = 0;
        while (a > 0) {
            int lastDigit = a % ONE_DIGIT;
            switch (lastDigit) {
                case 1:
                    if (one == true) {
                        different = false;
                    }
                    one = true;
                    break;
                case 2:
                    if (two == true) {
                        different = false;
                    }
                    two = true;
                    break;
                case 3:
                    if (three == true) {
                        different = false;
                    }
                    three = true;
                    break;
                case 4:
                    if (four == true) {
                        different = false;
                    }
                    four = true;
                    break;
                case 5:

                    if (five == true) {
                        different = false;
                    }
                    five = true;
                    break;
                case 6:

                    if (six == true) {
                        different = false;
                    }
                    six = true;
                    break;
                case 7:

                    if (seven == true) {
                        different = false;
                    }
                    seven = true;
                    break;
                case 8:

                    if (eight == true) {
                        different = false;
                    }
                    eight = true;
                    break;
                case 9:

                    if (nine == true) {
                        different = false;
                    }
                    nine = true;
                    break;
                case 0:
                    if (zero == true) {
                        different = false;
                    }
                    zero = true;
            }
            if (different == true) {
                numberDifferentNumbers++;
            }
            different = true;
            a = a / 10;

        }
        return numberDifferentNumbers;
    }


    public static String findSimpleDividers(int a) {
        StringBuilder simpleDividers = new StringBuilder();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                if (isPrime(i) == true) {
                    simpleDividers.append(i + " ");
                }
            }
        }
        return simpleDividers.toString();
    }


}
