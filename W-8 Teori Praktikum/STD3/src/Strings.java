import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Masukkan jumlah string yang ingin diurutkan:");
            int jumlah = scan.nextInt();
            scan.nextLine(); // Mengambil newline

            String[] kata = new String[jumlah];
            System.out.println("Masukkan stringnya:");

            for (int i = 0; i < jumlah; i++) {
                kata[i] = scan.nextLine();
            }

            Sorting.insertionSort(kata); // Menggunakan insertionSort

            System.out.println("String yang sudah diurutkan:");
            for (String s : kata) {
                System.out.println(s);
            }
        } finally {
            scan.close(); // Tutup Scanner untuk mencegah kebocoran sumber daya
        }
    }
}
