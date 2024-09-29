import com.polban.jtk.shape.*;

/**
 * The TestCylinder class is used to test the Cylinder class.
 */
public class TestCylinder {
    public static void main(String[] args) {
        // Declare and allocate a new instance of Cylinder with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" + " radius=" + c1.getRadius() + " height=" + c1.getHeight() + 
                           " base area=" + c1.getArea() + " volume=" + c1.getVolume());
        System.out.println(c1);
        c1.setColor("Black");
        System.out.println("New Color of c1 =" + c1.getColor());

        // Declare and allocate a new instance of Cylinder specifying radius, with default color and height

        // Declare and allocate a new instance of Cylinder specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:" + " radius=" + c2.getRadius() + " height=" + c2.getHeight() + 
                           " base area=" + c2.getArea() + " volume=" + c2.getVolume());
        System.out.println(c2);
        c2.setColor("Green");
        System.out.println("New Color of c2 =" + c2.getColor());
        

        // Declare and allocate a new instance of Cylinder specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:" + " radius=" + c3.getRadius() + " height=" + c3.getHeight() + 
                           " base area=" + c3.getArea() + " volume=" + c3.getVolume());
        System.out.println(c3);
        c3.setColor("Yellow:");
        System.out.println("New Color of c3 =" + c3.getColor());

    }
}

