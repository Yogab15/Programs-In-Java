package forGit;
 
abstract class Shapee {
    public abstract void draw();
    public abstract double calculateArea();
}

abstract class Circlee extends Shape {
    private double radius;

    public Circlee(double radius) {
        this.radius = radius;
    }

    
    public void draw() {
        System.out.println("Drawing Circle");
       	
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

abstract class Squaree extends Shape {
    private double side;

    public Squaree(double side) {
        this.side = side;
    }

    
    public void draw() {
        System.out.println("Drawing Square");
        	
    }

   
    public double calculateArea() {
        return side * side;
    }
}

abstract class Trianglee extends Shape {
    private double base;
    private double height;

    public Trianglee(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public void draw() {
        System.out.println("Drawing Triangle");
       	
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Shape11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Squaree square = new Squaree(4);
        Trianglee triangle = new Trianglee(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

