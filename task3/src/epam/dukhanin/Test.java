package epam.dukhanin;

import epam.dukhanin.fifth.CurrentDate;
import epam.dukhanin.first.Point;
import epam.dukhanin.first.Triangle;
import epam.dukhanin.fourth.MoodSensor;
import epam.dukhanin.second.Dragon;
import epam.dukhanin.third.Letter;

public class Test {
    public static void main(String[] args) {

        //first: coordinates of triangle
        Point a = new Point(2, 4);
        Point b = new Point(3, -1);
        Point c = new Point(-3, 3);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.isTriangle());
        System.out.println(triangle.isRightTriangle());

        //second: how many heads does a dragon has? if he is 323 years old
        Dragon dragon = new Dragon(323);
        System.out.println("dragon has: " + dragon.countDragonHeads() + " heads");
        System.out.println("dragon has: " + dragon.countDragonEyes() + " eyes");

        //third
        System.out.println(Letter.isVowelFirst('A'));
        System.out.println(Letter.isVowelSecond('A'));
        System.out.println(Letter.isVowelThird('A'));
        System.out.println(Letter.isVowelFourth('A'));

        System.out.println(Letter.isVowelFirst('v'));
        System.out.println(Letter.isVowelSecond('v'));
        System.out.println(Letter.isVowelThird('v'));
        System.out.println(Letter.isVowelFourth('v'));

        //fourth: Mood Sensor
        System.out.println(MoodSensor.showMyMood());

        //fifth: next date
        CurrentDate currentDate = new CurrentDate(28, 2, 1964);
        System.out.println(currentDate.nextDate());
    }
}
