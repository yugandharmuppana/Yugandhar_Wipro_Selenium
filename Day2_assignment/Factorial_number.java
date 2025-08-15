package Day2_assignment;
import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter non negtive integer: ");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Factorial is not defined for negative number");
		}
		else {
			long fac=1;
			for(int i=1;i<=num;i++) {
				fac*=i;
			}
			System.out.println("Factorial of "+ num +" is "+ fac);
		}

	}

}