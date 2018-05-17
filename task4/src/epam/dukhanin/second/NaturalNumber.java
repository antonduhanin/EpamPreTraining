package epam.dukhanin.second;

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
            number = number / ONE_DIGIT;
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

    public static boolean isPrime(int n) {
        if (n == NOT_PRIME_NUMBER) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
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

    public static int findCountDifferentDigits(int number) {
        boolean one, two, three, four, five, six, seven, eight, nine, zero;
        one = two = three = four = five = six = seven = eight = nine = zero = false;
        boolean different = true;
        int numberDifferentNumbers = 0;

        while (number > 0) {
            int lastDigit = number % ONE_DIGIT;
            if (lastDigit == 1) {
                if (one == true) {
                    different = false;
                }
                one = true;
            } else if (lastDigit == 2) {
                if (two == true) {
                    different = false;
                }
                two = true;
            } else if (lastDigit == 3) {
                if (three == true) {
                    different = false;
                }
                three = true;
            } else if (lastDigit == 4) {
                if (four == true) {
                    different = false;
                }
                four = true;
            } else if (lastDigit == 5) {
                if (five == true) {
                    different = false;
                }
                five = true;
            } else if (lastDigit == 6) {
                if (six == true) {
                    different = false;
                }
                six = true;
            } else if (lastDigit == 7) {
                if (seven == true) {
                    different = false;
                }
                seven = true;
            } else if (lastDigit == 8) {
                if (eight == true) {
                    different = false;
                }
                eight = true;
            } else if (lastDigit == 9) {
                if (nine == true) {
                    different = false;
                }
                nine = true;
            } else if (lastDigit == 0) {
                if (zero == true) {
                    different = false;
                }
                zero = true;
            }

            if (different == true) {
                numberDifferentNumbers++;
            }

            different = true;
            number = number / ONE_DIGIT;

        }
        return numberDifferentNumbers;
    }


    public static String findSimpleDividers(int number) {
        StringBuilder simpleDividers = new StringBuilder();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                if (isPrime(i) == true) {
                    simpleDividers.append(i + " ");
                }
            }
        }
        return simpleDividers.toString();
    }


}
