package Day2_assignment;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number=sc.nextInt();
		
		int originalNumber=number;
		int reverseNumber=0;
		
		while(number!=0) {
			int digit=number%10;    //to get last digit
			reverseNumber=reverseNumber*10+digit;
			number/=10;
		}
		
		if(originalNumber==reverseNumber) {
			System.out.println("Number is a palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
	}

}