package epam.dukhanin.third;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter {
    public static boolean isVowelFirst(char c) {
        c = toLowerCase(c);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (char v : vowels) {
            if (c == v) {
                isVowel = true;
            }
        }
        return isVowel;
    }

    public static boolean isVowelSecond(char c) {
        c = toLowerCase(c);
        Pattern vowelPattern = Pattern.compile("[aeiou]");
        Matcher vowelMatcher = vowelPattern.matcher("" + c);
        return vowelMatcher.find();
    }

    public static boolean isVowelThird(char c) {
        c = toLowerCase(c);
        boolean isVowel = false;
        switch (c) {
            case 'a':
                isVowel = true;
                break;
            case 'e':
                isVowel = true;
                break;
            case 'i':
                isVowel = true;
                break;
            case 'o':
                isVowel = true;
                break;
            case 'u':
                isVowel = true;
                break;
        }
        return isVowel;
    }

    public static boolean isVowelFourth(char c) {
        c = toLowerCase(c);
        boolean isVowel = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            isVowel = true;
        }
        return isVowel;
    }

    private static char toLowerCase(char c) {
        String s = "" + c;
        return s.toLowerCase().charAt(0);
    }
}