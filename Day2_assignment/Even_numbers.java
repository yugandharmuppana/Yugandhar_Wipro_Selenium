package Day2_assignment;

public class Even_numbers {

	public static void main(String[] args) {
		System.out.println("Even numbers from 2 to 50:");
		for(int i=2;i<=50;i++) 
		{
			if(i %2==0) 
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}

}