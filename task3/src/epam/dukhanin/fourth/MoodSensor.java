package epam.dukhanin.fourth;

import java.util.Random;

public class MoodSensor {
    public static String showMyMood() {
        String s = "my current mood is: ";
        Random random = new Random();
        if (random.nextBoolean()) {
            s += '\u263A';
        } else {
            s += '\u2639';
        }
        return s;
    }
}
