public class Test {
    public static void main(String[] args) {
        double[] mas = {3.2,2.2, 2,6};
     //   System.out.println(LocalExtemum.findLocalMinimum(mas));
        for(double a:LocalExtemum.reverseMas(mas)){
            System.out.print(a + " ");
        }
       // System.out.println(LocalExtemum.findMaxNumberOfMas(mas));
    }
}
