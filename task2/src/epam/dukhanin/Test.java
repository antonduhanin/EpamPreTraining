package epam.dukhanin;

import epam.dukhanin.fifth.CountNumbers;
import epam.dukhanin.first.WeightConverter;
import epam.dukhanin.fourth.CheckerSequence;
import epam.dukhanin.third.Swapper;
import epam.dukhanin.second.AreaCalculator;
import epam.dukhanin.seventh.Reverse;
import epam.dukhanin.sixth.Means;

public class Test {
    public static void main(String[] args) {

        //first: weight of dinosaur
        double weightKilograms = 26.2;

        double weightGrams = WeightConverter.convertKilogramToGrams(weightKilograms);
        double weightTones = WeightConverter.convertKilogramToTones(weightKilograms);
        double weightMilligrams = WeightConverter.convertKilogramToMilligrams(weightKilograms);

        System.out.printf("%.2f kg it's %.2f grams, %.4f tons, %.2f Milligrams\n", weightKilograms, weightGrams, weightTones, weightMilligrams);

        //second: area of ring
        double radiusFirst = 24;
        double radiusSecond = 12;
        double area = AreaCalculator.calculateRingArea(radiusFirst, radiusSecond);
        System.out.println("area of ring " + Double.toString(area));

        //third: swap 2 numbers
        int firstNumber = 5;
        int secondNumber = 23;
        Swapper swapper = new Swapper(firstNumber, secondNumber);
        System.out.println("before swap: " + swapper.toString());
        swapper.swapInt();
        System.out.println("after swap: " + swapper.toString());

        //fourth: increase or not sequence
        int sequence = 1357;
        boolean increase = CheckerSequence.increaseSequence(sequence);
        System.out.println("sequence is increase " + increase);


        //fifth: sum and multiplication numbers
        int number = 23324;
        int multiplication = CountNumbers.multiplyNumbers(number);
        int sum = CountNumbers.addNumbers(number);
        System.out.println("multiplication of numbers: " + multiplication + "\nsum of numbers: " + sum);


        //sixth: Arithmetic and Geometric Mean
        number = 123123;
        double s = Means.findArithmeticMean(number);
        System.out.println("Arithmetic mean of numbers: " + s);
        s = Means.findGeometricMean(number);
        System.out.println("Geometric mean of numbers: " + s);

        //seventh:
        int numberForReverse = 1234567;
        numberForReverse = Reverse.reverseNumber(numberForReverse);
        System.out.println(numberForReverse);
    }
}
