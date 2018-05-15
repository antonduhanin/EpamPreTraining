package epam.dukhanin;

public class Test {
    public static void main(String[] args) {

        double mas[][] = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.println(mas[i][j]);
            }
            System.out.println();
        }


        System.out.println(ArrayWorker.findMax(mas));
        System.out.println(ArrayWorker.findMin(mas));

        System.out.println(ArrayWorker.findArithmeticMean(mas));
        System.out.println(ArrayWorker.findGeometricMean(mas));
        System.out.println(ArrayWorker.findPositionLocalMinimum(mas));


        System.out.println(ArrayWorker.numberOfLocalMax(mas));

        mas = ArrayWorker.transposeMatrix(mas);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.println(mas[i][j]);
            }
            System.out.println();
        }
    }
}
