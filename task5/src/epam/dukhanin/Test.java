package epam.dukhanin;

public class Test {
    public static void main(String... args) {


        double a[] = {-4, 1.4, -4.5, 4.3, 4.4, 3};

        //main task
        System.out.println("max element: " + ArrayWorker.findMax(a));
        System.out.println("min element: " + ArrayWorker.findMin(a));
        System.out.println("Arithmetic Mean: " + ArrayWorker.findArithmeticMean(a));
        System.out.println("Geometric Mean: " + ArrayWorker.findGeometricMean(a));
        System.out.println("array sorted: " + ArrayWorker.checkSort(a));
        System.out.println("index of local minimum: " + ArrayWorker.findPositionLocalMinimum(a));

        System.out.println("before reverse: ");
        for (double element : a) {
            System.out.print(element+" ");
        }

        System.out.println("\nafter reverse: ");

        ArrayWorker.reverseMas(a);
        for (double element : a) {
            System.out.print(element+" ");
        }
        System.out.println();

        //individual task
        System.out.println("sum after positive element: " + ArrayWorker.findSumAfterPositiveElement(a));
        System.out.println("index of the element of maximal absolute value: "+ArrayWorker.findIndexMaxAbsValue(a));

    }
}
