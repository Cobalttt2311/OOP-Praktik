import java.util.Scanner;

public class LexicographicCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan kata pertama:");
        String kt1 = scanner.nextLine();
        System.out.println("Masukan kata kedua");
        String kt2 = scanner.nextLine();

        String combined = kt1 + " " + kt2;

        int length = combined.length();

        boolean isLexicographic = kt1.compareTo(kt2) < 0;

        System.out.println("Gabungan Kata :");
        System.out.println(combined);
        System.out.println(length);
        System.out.println(isLexicographic ? "Yes" : "No");
        System.out.println(hurufKapital(kt1) + " " + hurufKapital(kt2));


        scanner.close();

    }

    public static String hurufKapital(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}