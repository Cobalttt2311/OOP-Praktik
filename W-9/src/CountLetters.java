// ****************************************************************
// CountLetters.java
//
// Membaca kata dari input pengguna dan mencetak jumlah 
// kemunculan setiap huruf dalam kata tersebut.
// ****************************************************************

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; 
        Scanner scan = new Scanner(System.in); 

        // Dapatkan kata dari pengguna
        System.out.print("Masukkan satu kata (hanya huruf, tolong): "); 
        String word = scan.nextLine(); 

        // Ubah ke huruf besar semua
        word = word.toUpperCase(); 

        // Hitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                // Jika karakter bukan huruf, pengecualian akan ditangkap
                counts[word.charAt(i) - 'A']++; 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Karakter tidak valid: " + word.charAt(i));
            }
        }

        // Cetak frekuensi
        System.out.println(); 
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]); 
            }
        }
    }
}
