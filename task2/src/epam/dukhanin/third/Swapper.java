package epam.dukhanin.third;

public class Swapper {
    private int a;
    private int b;

    public Swapper(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swapInt() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    @Override
    public String toString() {
        return "Swapper{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
