import java.text.DecimalFormat;
import com.jtk.polban.*;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350; 
        Paint paint = new Paint(COVERAGE);

        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck: " + fmt.format(paint.amount(deck)) + " gallons");
        System.out.println("Big Ball: " + fmt.format(paint.amount(bigBall)) + " gallons");
        System.out.println("Tank: " + fmt.format(paint.amount(tank)) + " gallons");
    }
}
