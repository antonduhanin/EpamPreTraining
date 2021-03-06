package epam.dukhanin.third;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter {
    public static boolean isVowelFirst(char c) {

        c = new Character(c).toLowerCase(c);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (char v : vowels) {
            if (c == v) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    public static boolean isVowelSecond(char c) {
        c = new Character(c).toLowerCase(c);
        Pattern vowelPattern = Pattern.compile("[aeiou]");
        Matcher vowelMatcher = vowelPattern.matcher("" + c);
        return vowelMatcher.find();
    }

    public static boolean isVowelThird(char c) {
        c = new Character(c).toLowerCase(c);
        boolean isVowel = false;
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        return isVowel;
    }

    public static boolean isVowelFourth(char c) {
        c = new Character(c).toLowerCase(c);
        boolean isVowel = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            isVowel = true;
        }
        return isVowel;
    }

}