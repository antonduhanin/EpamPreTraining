package epam.dukhanin.first;

import java.util.Random;

public class CoinToss {

    public static String tossCoin(int numberTosses) {
        int heads = 0;
        for (int i = 0; i < numberTosses; i++) {
            if (new Random().nextBoolean()) {
                heads++;
            }
        }
        int tails = numberTosses - heads;
        return "heads: " + heads + "tails: " + tails;

    }

}
