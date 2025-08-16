package Day4_assignement;

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }
}
public class calculator_main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 10);           
        calc.add(3, 6, 9);         
        calc.add(2.5, 4.5);        
    }
}