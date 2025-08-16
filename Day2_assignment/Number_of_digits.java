package Day2_assignment;
import java.util.Scanner;
public class Number_of_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number=sc.nextInt();
		int count=0;
		
		if(number==0) {
			count=1;
		}
		else {
			for(;number!=0;number/=10,++count);
		}
		System.out.println("Number of digits: "+count);

	}

}