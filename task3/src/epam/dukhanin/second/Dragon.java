package epam.dukhanin.second;

public class Dragon {
    private int years;

    public Dragon(int years) {
        this.years = years;
    }

    public int countDragonHeads() {
        int heads = 0;
        if (years > 200 && years < 300) {
            heads = ((years - 200) * 2) + (200 * 3);
        } else if (years > 300) {
            heads = years - 300 + (100 * 2) + 200 * 3;
        } else {
            heads = years * 3;
        }
        return heads;
    }

    public int countDragonEyes() {
        return countDragonHeads() * 2;
    }
}
