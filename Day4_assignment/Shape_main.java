package Day4_assignement;

interface MyDrawable {
	 void draw();
	}
	abstract class MyShape implements MyDrawable {
	 abstract void area();  // Abstract method for area
	}
	class MyCircle extends MyShape {
	 double radius = 5;
	 public void draw() {
	     System.out.println("Drawing Circle");
	 }
	 public void area() {
	     double area = 3.14 * radius * radius;
	     System.out.println("Area of Circle: " + area);
	 }
	}
	class MyRectangle extends MyShape {
	 double length = 10;
	 double breadth = 5;
	 public void draw() {
	     System.out.println("Drawing Rectangle");
	 }
	 public void area() {
	     double area = length * breadth;
	     System.out.println("Area of Rectangle: " + area);
	 }
	}
	class MyTriangle extends MyShape {
	 double base = 6;
	 double height = 4;
	 public void draw() {
	     System.out.println("Drawing Triangle");
	 }
	 public void area() {
	     double area = 0.5 * base * height;
	     System.out.println("Area of Triangle: " + area);
	 }
	}
	public class Shape_main {
	    public static void main(String[] args) {
	        MyShape circle = new MyCircle();
	        MyShape rectangle = new MyRectangle();
	        MyShape triangle = new MyTriangle();
	        System.out.println("=== Circle ===");
	        circle.draw();
	        circle.area();
	        System.out.println("\n=== Rectangle ===");
	        rectangle.draw();
	        rectangle.area();
	        System.out.println("\n=== Triangle ===");
	        triangle.draw();
	        triangle.area();
	    }
	}
