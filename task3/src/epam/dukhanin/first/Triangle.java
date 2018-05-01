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
        boolean triangle = true;
        double ab = Math.sqrt(lenAB);
        double ac = Math.sqrt(lenAC);
        double cb = Math.sqrt(lenCB);
        if (ab + ac <= cb) {
            triangle = false;
        } else if (ab + cb <= ac) {
            triangle = false;
        } else if (cb + ac <= ac) {
            triangle = false;
        }
        return triangle;
    }

    public boolean isRightTriangle() {
        boolean rightTriangle = false;
        if (isTriangle() == false) {
            return rightTriangle;
        } else if (lenAB + lenAC == lenCB) {
            rightTriangle = true;
        } else if (lenAB + lenCB == lenAC) {
            rightTriangle = true;
        } else if (lenCB + lenAC == lenAB) {
            rightTriangle = true;
        }
        return rightTriangle;
    }

    private double lenSideSquare(Point a, Point b) {
        return Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2);
    }
}
