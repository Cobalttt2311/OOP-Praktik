import java.util.Scanner;

public class tiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bisa Menggunakan +,-,*,/,%");
        System.out.println("Masukan Input (Contoh : 1 + 1) :");
        String input = in.nextLine();

        String[] split = input.split(" ");
        int angka1 = Integer.parseInt(split[0]);
        String operator = split[1];
        int angka2 = Integer.parseInt(split[2]);
        int hasil = 0;
        float hasilDec = 0;

        if (operator.equals("+")){
            hasil = angka1 + angka2;
        } else if (operator.equals("-")){
            hasil = angka1 - angka2;
        } else if (operator.equals("*")){
            hasil = angka1 * angka2;
        } else if (operator.equals("/")){
            hasilDec = (float) angka1 / angka2;
        } else if (operator.equals("%")){
            hasil = angka1 % angka2;
        }

        if (operator.equals("/")){
            System.out.printf("Hasil Operasi (%s) = %.2f", operator, hasilDec);
        } else {
            System.out.printf("Hasil Operasi (%s) = %d", operator, hasil);
        }

    }
}
