package epam.dukhanin.first;

import java.util.Random;

public class CoinToss {
    private int heads;
    private int tails;

    public void tossCoin(int numberTosses) {
        for (int i = 0; i < numberTosses; i++) {
            if (new Random().nextBoolean()) {
                heads++;
            } else {
                tails++;
            }
        }
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return tails;
    }

    @Override
    public String toString() {
        return "CoinToss{" +
                "heads=" + heads +
                ", tails=" + tails +
                '}';
    }
}
