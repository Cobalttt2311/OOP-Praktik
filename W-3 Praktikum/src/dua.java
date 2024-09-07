import java.util.Scanner;

public class dua{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Berapa Baris ?");
        int row = in.nextInt();

        String[] word = new String[row];
        int[] number = new int[row];

        System.out.println("Masukan Input : Kata + Angka");
        System.out.println("============================");
        for (int i =0; i<row ; i++){
            System.out.println("Masukan kata ke-" +(i+1)+":");
            word[i] = in.next();

            System.out.println("Masukan angka ke-" +(i+1)+":");
            number[i] = in.nextInt();
        }

        System.out.println("=================================");
        for ( int i = 0; i < row ; i++){
            String tambah = String.format("%03d", number[i]);
            System.out.printf("%-15s%s%n", word[i], tambah);          
        }
        System.out.println("=================================");
    }
}