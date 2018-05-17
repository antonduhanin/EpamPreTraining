package epam.dukhanin.first;

public class Triangle {
    private Point a, b, c;
    private double lenAB, lenAC, lenCB;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        lenAB = lenSideSquare(a, b); //sides of triangle squared
        lenAC = lenSideSquare(a, c);
        lenCB = lenSideSquare(c, b);
    }

    public boolean isTriangle() {
        double ab = Math.sqrt(lenAB);
        double ac = Math.sqrt(lenAC);
        double cb = Math.sqrt(lenCB);

        return !(ab + ac <= cb || ab + cb <= ac || cb + ac <= ab);

    }

    public boolean isRightTriangle() {
        if (isTriangle() == false) {
            return false;
        }
        return lenAB + lenAC == lenCB || lenAB + lenCB == lenAC || lenCB + lenAC == lenAB;
    }

    private double lenSideSquare(Point a, Point b) {
        return Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2);
    }
}
