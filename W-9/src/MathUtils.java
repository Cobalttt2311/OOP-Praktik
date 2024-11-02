public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Nilai faktorial terlalu besar untuk dihitung (maksimum 16).");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
