import java.math.BigInteger;
import java.util.Scanner;

public class lima {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BigInteger angka1 = null;
        BigInteger angka2 = null;

        do{
            System.out.println("Masukan Angka Pertama :");
            String bigIn = in.nextLine();

            angka1 = new BigInteger(bigIn);
            int panjang = bigIn.length();
            if (panjang <= 200 && angka1.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("Pass test");
                break;
            } else {
                System.out.println("Error");
            }
        }while(true);

        do{
            System.out.println("Masukan Angka Kedua :");
            String bigIn2 = in.nextLine();

            angka2 = new BigInteger(bigIn2);
            int panjang2 = bigIn2.length();
    
            if (panjang2 <= 200 && angka2.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("Pass test");
                break;
            } else {
                System.out.println("Error");
            }
        }while(true);


        BigInteger hasilKali = angka1.multiply(angka2);
        System.out.println("Hasil Perkalian = " +hasilKali);

        BigInteger hasiltambah = angka1.add(angka2);
        System.out.println("Hasil Penjumlahan = " +hasiltambah);
    }
}
