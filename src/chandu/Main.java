package chandu;

public class Main {
	
	    public static void main(String[] args) {
	        // Create instances of concrete subclasses
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);

	        // Call methods on objects
	        circle.printDetails();
	        System.out.println("Area of the circle: " + circle.calculateArea());

	        rectangle.printDetails();
	        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
	    }
	}

