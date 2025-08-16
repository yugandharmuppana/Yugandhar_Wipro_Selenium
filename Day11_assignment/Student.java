package Basic_Module;

public class Student {
	String name="Yugandhar Muppana";
	int rollno=101;
	float per=89.08f;
	short age=22;
	String course="Java Selenium";
	String collegename="JVM";
	String address="606 D,Andhrapradesh";
	char div='A';
	
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("Name 		="+stud.name);
		System.out.println("Rollno 		="+stud.rollno);
		System.out.println("Percentage 	="+stud.per);
		System.out.println("Age 		="+stud.age);
		System.out.println("Course 		="+stud.course);
		System.out.println("Collegename ="+stud.collegename);
		System.out.println("Address 	="+stud.address);
		System.out.println("Division 	="+stud.div);
	
	}

}
