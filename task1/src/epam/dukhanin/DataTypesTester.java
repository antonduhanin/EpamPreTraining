package epam.dukhanin;

public class DataTypesTester {

    public static void testByte() {
        System.out.println("\n***** Arithmetical Operators with byte *****");
        byte a = 7, b = 127, c;

        //additional
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        a = -7;
        b = -5;
        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a / b; --> incompatible types
        //c = (byte) (a / 0); --> arithmeticException: / by zero
        //c = (byte) (a % 0); --> arithmeticException: / by zero

        a = 3;
        // unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);

        // postfix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = (byte) (a++ + b++);
        System.out.printf("a++ + b++ = %d \n", c);

        // prefix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = (byte) (++a + ++b);
        System.out.printf("++a + ++b = %d \n", c);

        // postfix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = (byte) (a-- + b--);
        System.out.printf("a-- + b-- = %d \n", c);

        // prefix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = (byte) (--a + --b);
        System.out.printf("--a + --b = %d \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3;
        b = 5;
        // bitwise AND
        c = (byte) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (byte) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        c = (byte) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        //right shift
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 3;
        // zero fill right shift
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        // zero fill right shift
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        a = 2;
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        //   c %= 0; --> Arithmetical Exception: / by zero
        //   c /= 0; --> Arithmetical Exception: / by zero

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        short sh = -32000;
        char ch = '\u0002';
        int nt = 2333333;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) nt;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", nt, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        //c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
    }

    public static void testShort() {
        System.out.println("\n***** Arithmetical Operators with short *****");
        short a = 7, b = 127, c;

        //additional
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        a = -7;
        b = -5;
        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a / b; --> incompatible types
        //c = (short) (a / 0); --> arithmeticException: / by zero
        //c = (short) (a % 0); --> arithmeticException: / by zero

        a = 3;
        // unary minus
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);

        // postfix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = (short) (a++ + b++);
        System.out.printf("a++ + b++ = %d \n", c);

        // prefix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = (short) (++a + ++b);
        System.out.printf("++a + ++b = %d \n", c);

        // postfix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = (short) (a-- + b--);
        System.out.printf("a-- + b-- = %d \n", c);

        // prefix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = (short) (--a + --b);
        System.out.printf("--a + --b = %d \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3;
        b = 5;
        // bitwise AND
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        c = (short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        //right shift
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 3;
        // zero fill right shift
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        // zero fill right shift
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        a = 2;
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        //   c %= 0; --> Arithmetical Exception: / by zero
        //   c /= 0; --> Arithmetical Exception: / by zero

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        byte bt = 127;
        char ch = '\u0002';
        int nt = 2333333;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short) ch;
        System.out.printf("short = char: c = (char)'%c' --> c = %d\n", ch, c);
        c = (short) nt;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", nt, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        //c = (short)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
    }

    public static void testInt() {
        System.out.println("\n***** Arithmetical Operators with int *****");
        int a = 7, b = 127, c;

        //additional
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        a = -7;
        b = -5;
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a / 0; --> arithmeticException: / by zero
        //c = a % 0; --> arithmeticException: / by zero

        a = 3;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // postfix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = a++ + b++;
        System.out.printf("a++ + b++ = %d \n", c);

        // prefix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = ++a + ++b;
        System.out.printf("++a + ++b = %d \n", c);

        // postfix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = a-- + b--;
        System.out.printf("a-- + b-- = %d \n", c);

        // prefix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = --a + --b;
        System.out.printf("--a + --b = %d \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3;
        b = 5;
        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 3;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -3;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        a = 2;
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        //   c %= 0; --> Arithmetical Exception: / by zero
        //   c /= 0; --> Arithmetical Exception: / by zero

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -31777;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;   System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",     bool);
    }

    public static void testLong() {
        System.out.println("\n***** Arithmetical Operators with long *****");
        long a = 7777777777777l, b = 1274333333333l, c;

        //additional
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        a = -7;
        b = -5;
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a / 0; --> arithmeticException: / by zero
        //c = a % 0; --> arithmeticException: / by zero

        a = 3;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // postfix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = a++ + b++;
        System.out.printf("a++ + b++ = %d \n", c);

        // prefix increment
        System.out.printf("a = %d b= %d \n", a, b);
        c = ++a + ++b;
        System.out.printf("++a + ++b = %d \n", c);

        // postfix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = a-- + b--;
        System.out.printf("a-- + b-- = %d \n", c);

        // prefix decrement
        System.out.printf("a = %d b= %d \n", a, b);
        c = --a + --b;
        System.out.printf("--a + --b = %d \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3;
        b = 5;
        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));
        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));
        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));
        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));
        // left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));

        a = -3;
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));

        a = 3;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));

        a = -3;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((int) a), Integer.toBinaryString((int) c));

        System.out.println("\n***** Assignment Operators *****");

        a = 2;
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        //   c %= 0; --> Arithmetical Exception: / by zero
        //   c /= 0; --> Arithmetical Exception: / by zero

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -31777;
        char ch = '\u0002';
        int nt = 355555555;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = nt;
        System.out.printf("long = int: c = %d --> c = %d\n", nt, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;   System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",     bool);
    }


    public static void testFloat() {
        System.out.println("\n***** Arithmetical Operators with float*****");
        float a = 7.2f, b = 127.32f, c;

        //additional
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        a = -7.23f;
        b = -5.23f;
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        c = a / 0;
        System.out.printf("%f / 0 = %f\n", a, c);
        c = a % 0;
        System.out.printf("%f %% 0 = %f\n", a, c);

        a = 312.f;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        // postfix increment
        System.out.printf("a = %f b= %f \n", a, b);
        c = a++ + b++;
        System.out.printf("a++ + b++ = %f \n", c);

        // prefix increment
        System.out.printf("a = %f b= %f \n", a, b);
        c = ++a + ++b;
        System.out.printf("++a + ++b = %f \n", c);

        // postfix decrement
        System.out.printf("a = %f b= %f \n", a, b);
        c = a-- + b--;
        System.out.printf("a-- + b-- = %f \n", c);

        // prefix decrement
        System.out.printf("a = %f b= %f \n", a, b);
        c = --a + --b;
        System.out.printf("--a + --b = %f \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3.21f;
        b = 5.32f;

        // bitwise AND
        //c = a & b; --> Operator '&' cannot be applied to 'float', 'float'
        // bitwise OR
        //c = a | b; --> Operator '|' cannot be applied to 'float', 'float'
        // bitwise XOR
        //c = a ^ b --> Operator '&' cannot be applied to 'float', 'float';
        // bitwise unary compliment
        //c = ~a ; --> Operator '~' cannot be applied to 'float'

        // left shift
        //c = a << 1; --> Operator '<<' cannot be applied to 'float', 'int'
        //right shift
        //c = a >> 1; --> Operator '>>' cannot be applied to 'float', 'int'
        // zero fill right shift
        //c = a >>> 1; --> Operator '>>>' cannot be applied to 'float', 'int'

        System.out.println("\n***** Assignment Operators *****");

        a = 2;
        c = 5;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        c /= 0;
        System.out.printf("%f /= 0 %f\n", a, c);
        c %= 0;
        System.out.printf("%f %%= 0 = %f\n", a, c);

        //c |= a;
        //c &= a;
        //c ^= a;
        //c >>= 1;
        //c <<= 1;
        //c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -31777;
        char ch = '\u0002';
        int nt = 123213213;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("float= byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float= short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float= char: c = '%c' --> c = %f\n", ch, c);
        c = nt;
        System.out.printf("float= int: c = %d --> c = %f\n", l, c);
        c = l;
        System.out.printf("float= long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("float= float: c = %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float= double: c = (float)%f --> c = %f\n", d, c);
        // c = (float)bool;   System.out.printf("float= boolean: c = (float)%b --> Compile Error\n",     bool);
    }


    public static void testChar() {
        System.out.println("\n***** Arithmetical Operators with char*****");
        char a = 23;
        char b = 'a';

        char c;
        //additional
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        // subtraction
        //c = (char)a - b; incompatible types
        // multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);

        // modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);

        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);
        // unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);


        // postfix increment
        //c = a++ + b++;
        // prefix increment
        //c = ++a + ++b;
        // postfix decrement
        //c = a-- + b--;
        // prefix decrement
        //c = --a + --b;

        System.out.println("\n***** Bitwise Operators *****");
        a = 3;
        b = 5;
        // bitwise AND
        c = (char) (a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        // bitwise unary compliment
        c = (char) ~a;
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        // left shift
        c = (char) (a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -3;
        //right shift
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 3;
        // zero fill right shift
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -3;
        // zero fill right shift
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);

//        c %= 0; java.lang.ArithmeticException: / by zero
//        System.out.printf("%f %%= 0 = %f\n", a, c);
//        c /= 0;
//        System.out.printf("%f /= 0 = %f\n", a, c);

        c |= a;
        c &= a;
        c ^= a;
        c >>= 1;
        c <<= 1;
        c >>>= 1;


        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        //System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -31777;
        int nt = 231;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) nt;
        System.out.printf("char = int: c = '%c' --> c = %c\n", nt, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
        // c = (char)bool;   System.out.printf("char = boolean: c = (char)%b --> Compile Error\n",     bool);


    }

    public static void testDouble() {
        System.out.println("\n***** Arithmetical Operators with double*****");
        double a = 7.2, b = 127.32, c;

        //additional
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        a = -7.23;
        b = -5.23;
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        c = a / 0;
        System.out.printf("%f / 0 = %f\n", a, c);
        c = a % 0;
        System.out.printf("%f %% 0 = %f\n", a, c);

        a = 312;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        // postfix increment
        System.out.printf("a = %f b= %f \n", a, b);
        c = a++ + b++;
        System.out.printf("a++ + b++ = %f \n", c);

        // prefix increment
        System.out.printf("a = %f b= %f \n", a, b);
        c = ++a + ++b;
        System.out.printf("++a + ++b = %f \n", c);

        // postfix decrement
        System.out.printf("a = %f b= %f \n", a, b);
        c = a-- + b--;
        System.out.printf("a-- + b-- = %f \n", c);

        // prefix decrement
        System.out.printf("a = %f b= %f \n", a, b);
        c = --a + --b;
        System.out.printf("--a + --b = %f \n", c);

        System.out.println("\n***** Bitwise Operators *****");
        a = 3.21d;
        b = 5.32d;

        // bitwise AND
        //c = a & b; --> Operator '&' cannot be applied to 'double', 'double'
        // bitwise OR
        //c = a | b; --> Operator '|' cannot be applied to 'double', 'double'
        // bitwise XOR
        //c = a ^ b --> Operator '&' cannot be applied to 'double', 'double';
        // bitwise unary compliment
        //c = ~a ; --> Operator '~' cannot be applied to 'double'

        // left shift
        //c = a << 1; --> Operator '<<' cannot be applied to 'double', 'int'
        //right shift
        //c = a >> 1; --> Operator '>>' cannot be applied to 'double', 'int'
        // zero fill right shift
        //c = a >>> 1; --> Operator '>>>' cannot be applied to 'double', 'int'

        System.out.println("\n***** Assignment Operators *****");

        a = 2.12;
        c = 5.321;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        c %= 0;
        System.out.printf("%f %%= 0 = %f\n", a, c);
        c /= 0;
        System.out.printf("%f /= 0 = %f\n", a, c);

        //c |= a;
        //c &= a;
        //c ^= a;
        //c >>= 1;
        //c <<= 1;
        //c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -31777;
        char ch = '\u0002';
        int nt = 123213213;
        long l = 100000000000000000L;
        float f = 1.9f;
        boolean bool = true;

        c = bt;
        System.out.printf("double= byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double= short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double= char: c = '%c' --> c = %f\n", ch, c);
        c = nt;
        System.out.printf("double= int: c = %d --> c = %f\n", l, c);
        c = l;
        System.out.printf("double= long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double= float: c = %f --> c = %f\n", f, c);
        // c = (double)bool;   System.out.printf("double= boolean: c = (double)%b --> Compile Error\n",     bool);
    }

    public static void testBoolean() {
        boolean a = true;
        boolean b = false;

        System.out.printf("%b|%b: " + (a | b) + '\n', a, b);
        System.out.printf("%b&%b: " + (a & b) + '\n', a, b);
        System.out.printf("%b^%b: " + (a ^ b) + '\n', a, b);
        System.out.printf("");
    }
}
