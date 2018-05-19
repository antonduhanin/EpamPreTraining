package epam.dukhanin;

public class ArrayWorker {
    //main task
    public static double findMax(double mas[]) {
        double max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public static double findMin(double mas[]) {
        double min = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }

    public static double findArithmeticMean(double mas[]) {
        double sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum / (mas.length - 1);
    }

    public static double findGeometricMean(double mas[]) {
        double multiplication = 1;
        for (int i = 0; i < mas.length; i++) {
            multiplication *= mas[i];
        }
        return Math.pow(multiplication, 1.0 / mas.length - 1);
    }


    public static boolean checkSort(double a[]) {
        if (a.length < 2) {
            return false;
        }

        boolean decrease = isDecrease(a);

        for (int i = 0; i < a.length - 1; i++) {
            if ((!decrease & a[i] > a[i + 1]) | (decrease & a[i] < a[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecrease(double a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int findPositionLocalMinimum(double mas[]) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                return i + 1;
            } else if (mas[i] > mas[i + 1]) {
                return i + 2;
            }
        }
        return -1;
    }

    public static void reverseMas(double mas[]) {
        for (int i = 0; i < mas.length / 2; i++) {
            mas[i] = mas[i] - mas[mas.length - i - 1];
            mas[mas.length - i - 1] = mas[i] + mas[mas.length - i - 1];
            mas[i] = mas[mas.length - i - 1] - mas[i];
        }
    }

    //individual task
    public static double findSumAfterPositiveElement(double a[]) {
        boolean flag = false;
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (flag == true) {
                sum += a[i];
            }
            if (a[i] > 0) {
                flag = true;
            }
        }
        return sum;
    }

    public static int findIndexMaxAbsValue(double[] mas) {
        double max = Math.abs(mas[0]);
        int index = 0;

        for (int i = 1; i < mas.length; i++) {
            if (Math.abs(mas[i]) > Math.abs(max)) {
                index = i + 1;
                max = Math.abs(mas[i]);
            }
        }
        return index;
    }
}
