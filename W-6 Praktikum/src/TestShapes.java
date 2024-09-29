import com.polban.jtk.shape.*;

public class TestShapes {
    public static void main(String[] args) {
        // Test Shape
        Shape shape = new Shape();
        System.out.println(shape);

        // Test Circle2
        Circle2 circle = new Circle2(2.5, "red", false);
        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(2.0, 4.0, "blue", true);
        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        square.setSide(5.0);
        System.out.println("New side of square: " + square.getSide());
        System.out.println(square);
    }
}
