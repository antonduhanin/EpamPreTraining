package epam.dukhanin;

public class Tester {
    public static void testInt() {
        System.out.println("int test start: ");
        int a = 7;
        int b = 5;

        int c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);


        System.out.printf("a = %d b= %d \n", a, b, c);
        c = a++ + b++;
        System.out.printf("a++ + b++ = %d \n", c);


        a = 7;
        b = 5;
        c = ++a + ++b;
        System.out.printf("++a + ++b = %d \n", c);


        a = -7;
        b = -5;
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

    }

    public static void testByte() {
        System.out.println("byte test start: ");
        byte a = 7;
        byte b = 127;

        byte c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        a = -7;
        b = -5;
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);


    }

    public static void testShort() {
        System.out.println("short test start: ");
        short a = 7;
        short b = 129;
        short c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

    }

    public static void testFloat() {
        float a = 23.1f;
        float b = (float) 10.1;

        float c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);


    }
}
