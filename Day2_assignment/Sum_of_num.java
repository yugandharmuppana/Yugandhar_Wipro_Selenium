package Day2_assignment;
import java.util.Scanner;

public class Sum_of_num {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = Scanner.nextInt(); 

        int sum = 0;
        int tempNumber = number; 
       
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Extract the last digit using the modulo operator
            sum += digit; // Add the extracted digit to the sum
            tempNumber /= 10; // Remove the last digit by integer division
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum); // Print the result


	}

}


  