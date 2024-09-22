import com.polban.jtk.inventory.*;

public class Main2 {
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.initBarang();
        System.out.println("Barang yang sekarang: ");
        beli.showBarang();
        System.out.println("Pengadaan: ");
        beli.pengadaan();
    }
}


