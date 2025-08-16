package Day6_assignment;

public class Finally_use {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			int[] a=new int[4];
			System.out.println(a[6]);//ArrayIndexOutOfBoundsException
			}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Important code");
		}
		System.out.println("end");
	}	
	
}