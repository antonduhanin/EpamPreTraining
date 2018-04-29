package epam.dukhanin.seventh;

public class Reverse {
    public static int reverseNumber(int a) {
        StringBuilder s = new StringBuilder(Integer.toString(a));
        s.reverse();
        return Integer.parseInt(new String(s));
    }
}
