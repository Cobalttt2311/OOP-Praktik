import java.util.Scanner;

public class NumericTypeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        long number = in.nextLong();

        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            System.out.println(number + " bisa disimpan dalam tipe byte.");
        } else {
            System.out.println(number + " tidak bisa disimpan dalam tipe byte.");
        }

        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            System.out.println(number + " bisa disimpan dalam tipe short.");
        } else {
            System.out.println(number + " tidak bisa disimpan dalam tipe short.");
        }

        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println(number + " bisa disimpan dalam tipe int.");
        } else {
            System.out.println(number + " tidak bisa disimpan dalam tipe int.");
        }
        
        if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            System.out.println(number + " bisa disimpan dalam tipe long.");
        } else {
            System.out.println(number + " tidak bisa disimpan dalam tipe long.");
        }
    }
}
