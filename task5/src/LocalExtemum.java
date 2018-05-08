public class LocalExtemum {
    public static int findLocalMinimum(int mas[]) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                return mas[i];
            } else if (mas[i] > mas[i + 1]) {
                return mas[i + 1];
            }
        }
        return -1;
    }

    public static double[] reverseMas(double mas[]) {

        for (int i = 0; i < mas.length / 2; i++) {
           mas[i] = mas[i]-mas[mas.length-i-1];
            mas[mas.length-i-1] = mas[i]+mas[mas.length-i-1];
            mas[i] = mas[mas.length-i-1]-mas[i];

        }
        return mas;
    }

    public static int findMaxNumberOfMas(int a[]) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                max = i;
            }
        }
        return max;
    }
    public static int findSumAfterPositiveElement(int a[]) {
        return 0;
    }
}
