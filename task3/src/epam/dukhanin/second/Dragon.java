package epam.dukhanin.second;

public class Dragon {

    private static final int AGE_PERIOD_FIRST = 100;
    private static final int AGE_PERIOD_SECOND = 200;
    private static final int AGE_PERIOD_THIRD = 300;
    private static final int HEADS_PERIOD_FIRST = 3;
    private static final int HEADS_PERIOD_SECOND = 2;


    private int years;

    public Dragon(int years) {
        this.years = years;
    }

    public int countDragonHeads() {
        int heads = 0;
        if (years > 0) {
            if (years > AGE_PERIOD_SECOND && years < AGE_PERIOD_THIRD) {
                heads = ((years - AGE_PERIOD_SECOND) * HEADS_PERIOD_SECOND) + (AGE_PERIOD_SECOND * HEADS_PERIOD_FIRST);
            } else if (years > AGE_PERIOD_THIRD) {
                heads = years - AGE_PERIOD_THIRD + (AGE_PERIOD_FIRST * HEADS_PERIOD_SECOND) + AGE_PERIOD_SECOND * HEADS_PERIOD_FIRST;
            } else {
                heads = years * HEADS_PERIOD_FIRST;
            }
        }
        return heads;
    }

    public int countDragonEyes() {
        return countDragonHeads() * 2;
    }
}
