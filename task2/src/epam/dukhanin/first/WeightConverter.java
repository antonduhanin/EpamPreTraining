package epam.dukhanin.first;

public class WeightConverter {
    public final static int GRAMS_PER_KILOGRAM = 1000;
    public final static double TONES_PER_KILOGRAM = 0.001;
    public final static int MILLIGRAMS_PER_KILOGRAM = 1_000_000;

    public static double convertKilogramToGrams(double weightKG) {
        return weightKG * GRAMS_PER_KILOGRAM;
    }

    public static double convertKilogramToTones(double weightKG) {
        return weightKG * TONES_PER_KILOGRAM;
    }

    public static double convertKilogramToMilligrams(double weightKG) {
        return weightKG * MILLIGRAMS_PER_KILOGRAM;
    }
}
