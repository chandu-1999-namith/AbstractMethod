package chandu;

abstract class Shape {
	// Define an abstract class
	
	    // Abstract method that must be implemented by subclasses
	    public abstract double calculateArea();
	    
	    // Concrete method
	    public void printDetails() {
	        System.out.println("This is a shape.");
	    }
	}

	// Concrete subclass of Shape
	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Concrete subclass of Shape
	class Rectangle extends Shape {
	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public double calculateArea() {
	        return width * height;
	    }
	}

	


