// ****************************************************************
// ParseInts.java
//
// Membaca baris teks dan mencetak jumlah integer dalam baris tersebut.
// ****************************************************************

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan sebuah baris teks: ");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Membaca setiap token dan menjumlahkan integer yang ada
        while (scanLine.hasNext()) {
            String token = scanLine.next();  // Simpan token terlebih dahulu
            try {
                // Mencoba mengubah token menjadi integer
                val = Integer.parseInt(token);
                sum += val;
            } catch (NumberFormatException e) {
                // Menampilkan token yang bukan integer
                System.out.println("Terdapat karakter yang bukan integer: " + token);
            }
        }

        // Mencetak jumlah integer yang ditemukan
        System.out.println("Jumlah dari integer dalam baris ini adalah: " + sum);
    }
}
