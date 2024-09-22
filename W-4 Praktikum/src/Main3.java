import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main3 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 15000, 10);
        Sales sales = new Sales(product);
        sales.sellProduct(5);
        sales.restockProduct(10);
        sales.updateProductPrice(20000);
    }
}
