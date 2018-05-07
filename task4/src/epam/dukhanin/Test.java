package epam.dukhanin;

import epam.dukhanin.epam.dukhanin.second.NaturalNumber;
import epam.dukhanin.first.CoinToss;

public class Test {
    public static void main(String[] args) {
        CoinToss coinToss = new CoinToss();
        coinToss.tossCoin(1000);
        System.out.println(coinToss.toString());

        System.out.println("biggest digit is: " + NaturalNumber.findBiggestDigit(1238243));
        System.out.println("is palindrome: " + NaturalNumber.isPalindrome(1221));
        System.out.println("is prime: " + NaturalNumber.isPrime(1));
        System.out.println("simple dividers: " + NaturalNumber.findSimpleDividers(24));
        System.out.println("greatest common divisor: " + NaturalNumber.findGreatestCommonDivisor(16, 48));
        System.out.println("least common multiple: " + NaturalNumber.findLeastCommonMultiple(16, 56));
        System.out.println("number of different numbers:" + NaturalNumber.findCountDifferentDigits(223355322));
    }
}
