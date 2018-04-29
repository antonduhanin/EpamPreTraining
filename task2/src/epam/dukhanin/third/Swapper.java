package epam.dukhanin.third;

public class Swapper {
    private int a;
    private int b;

    public Swapper(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swapInt() {
        // a = 5; b =7;
        a = a + b;//a=12 b =7
        b = a - b;//a =12 b =5
        a = a - b;// a = 7 b=5
    }

    @Override
    public String toString() {
        return "Swapper{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
