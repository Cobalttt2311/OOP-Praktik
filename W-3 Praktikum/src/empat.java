import java.util.Scanner;

public class empat {
    public static void main(String[] args) {
        // Gaji = 500.000 
        // Bonus = 25% 40 Item
        //         35% 80 Item
        // Punish = -15% if < 15 Item
        //        = 50 rb X 10% (50 rb adalah Harga Item) / if 40 < Item >= 15

        Scanner in = new Scanner(System.in);
        int Gaji = 500000;
        int GajiKamu = 0;
        System.out.println("Program Penghitung Gaji Sales");
        System.out.println("=============================");
        System.out.print("Masukan Jumlah Item Hasil Penjualan :");
        int jml = in.nextInt();

        if ( jml >= 40 ){
            GajiKamu = (int) (0.25 * Gaji) + Gaji;
        } else if ( jml > 80 ){
            GajiKamu = (int) (0.35 * Gaji) + Gaji;
        } else if ( jml >= 15 && jml < 40){
            GajiKamu = (int) (0.10*(jml * 50000)) + Gaji;
        } else {
            GajiKamu = Gaji - (int) (0.15* Gaji);
        }

        System.out.printf("Gaji Kamu = %d" , GajiKamu);

    }
}
