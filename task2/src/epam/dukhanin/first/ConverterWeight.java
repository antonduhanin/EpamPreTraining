package epam.dukhanin.first;

public class ConverterWeight {
    public static double convertKgToGr(double weightKG) {
        return weightKG * 1000;
    }

    public static double convertKgToT(double weightKG) {
        return weightKG * 0.001;
    }


    public static double convertKgToMg(double weightKG) {
        return weightKG * 1000000;
    }
}
