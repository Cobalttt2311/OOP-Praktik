import com.polban.jtk.sales.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500000, 10);

        Sales sales = new Sales(product1);

        sales.sellProduct(5);
        sales.restockProduct(10);
        sales.updateProductPrice(2000000);
    }
}
