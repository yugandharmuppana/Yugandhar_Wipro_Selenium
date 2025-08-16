package Day4_assignement;

class Shape {
    void area() {
        System.out.println("Calculating area in base class...");
    }
}
class Circle extends Shape {
    void area() {
        double radius = 5.0;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    void area() {
        int length = 10;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class circle_area {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.area();  
        s = new Rectangle();
        s.area();  
    }
}