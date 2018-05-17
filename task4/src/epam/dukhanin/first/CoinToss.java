package epam.dukhanin.first;

import java.util.Random;

public class CoinToss {

    public static String tossCoin(int numberTosses) {
        int heads = 0;
        Random random = new Random();
        for (int i = 0; i < numberTosses; i++) {
            if (random.nextBoolean()) {
                heads++;
            }
        }
        int tails = numberTosses - heads;

        return "heads: " + heads + "tails: " + new Integer(numberTosses - heads);
    }

}
