package Day2_assignment;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int count=sc.nextInt();
		int n1=0,n2=1;
		
		System.out.print("Fibonacci Series: ");
		for(int i=0;i<=count;i++) {
			System.out.print(n1+" ");
		    int n3=n2+n1;
			n1=n2;
			n2=n3;
		}

	}

}