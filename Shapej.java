package forGit;
 
class Shape1 {
 
 double getArea()  // Method to get area
 {
     return 0; // Default implementation returns 0
 }
}


abstract class Rectanglee extends Shape {
 private double length;
 private double width;
 
 
 Rectanglee(double length, double width) // Constructor
 {
     this.length = length;
     this.width = width;
 }
 
 
 
 double getArea() 
 {
     return length * width;
     
 }



@Override
double calculateArea() {
	// TODO Auto-generated method stub
	return 0;
}



@Override
double calculatePerimeter() {
	// TODO Auto-generated method stub
	return 0;
}
}

public class Shapej   //Main class

{   
 public static void main(String[] args) 
 {
    
     Rectangle rectangle = new Rectangle(5, 10);   // Create an instance of Rectangle
     
     
     double area = rectangle.getArea();       // Get the area of the rectangle
     
     System.out.println("Area of the rectangle: " + area);
 }


}
