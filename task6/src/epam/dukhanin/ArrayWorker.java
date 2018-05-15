package epam.dukhanin;

public class ArrayWorker {
    public static double findMax(double mas[][]) {
        double max = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }

        }
        return max;
    }

    public static double findMin(double mas[][]) {
        double min = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
            }
        }
        return min;
    }

    public static double findArithmeticMean(double mas[][]) {
        double sum = 0;
        int numberOfElements = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
                numberOfElements++;
            }
        }
        return sum / numberOfElements;
    }

    public static double findGeometricMean(double mas[][]) {
        double multiplication = 1;
        int numberOfElements = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                multiplication *= mas[i][j];
                numberOfElements++;
            }
        }

        return Math.pow(multiplication, 1.0 / numberOfElements);
    }

    public static String findPositionLocalMinimum(double mas[][]) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - 1; j++) {
                if (mas[i][j] < mas[i][j + 1]) {
                    return "row: " + Integer.toString(i + 1) + " columns: " + Integer.toString(j + 1);
                } else if (mas[i][j] > mas[i][j + 1]) {
                    return "row: " + Integer.toString(i + 1) + " columns: " + Integer.toString(j + 2);
                }
            }
        }
        return "-1";
    }

    public static double[][] transposeMatrix(double mas[][]) {
        double[][] temp = new double[mas[0].length][mas.length];

        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[0].length; j++)
                temp[j][i] = mas[i][j];
        return temp;
    }

    public static int numberOfLocalMax(double mas[][]) {
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - 1; j++) {
                if (mas[i][j] != mas[i][j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }
}