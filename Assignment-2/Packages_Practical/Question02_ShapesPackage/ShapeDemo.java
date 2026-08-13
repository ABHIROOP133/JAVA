import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("--- Shapes Package Demonstration ---");
        
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Details (Radius 5.0):");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        
        System.out.println();
        
        System.out.println("Rectangle Details (Length 4.0, Width 6.0):");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
