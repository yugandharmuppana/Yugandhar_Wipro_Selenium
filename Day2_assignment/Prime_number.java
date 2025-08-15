package Day2_assignment;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num +" is not a prime number");
		}
		else
			System.out.println(num +" is a prime number");

	}

}
