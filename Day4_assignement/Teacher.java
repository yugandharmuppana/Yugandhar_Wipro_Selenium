package Day4_assignement;

abstract class Person {
	 String name;
	 int age;
	 Person(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }
	 abstract void getRoleInfo();
	}
	class Student extends Person {
	 String course;
	 int rollNo;
	 Student(String name, int age, String course, int rollNo) {
	     super(name, age);
	     this.course = course;
	     this.rollNo = rollNo;
	 }
	 void getRoleInfo() {
	     System.out.println("Student Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Course: " + course);
	     System.out.println("Roll No: " + rollNo);
	 }
	}
	class Professor extends Person {
	 String subject;
	 double salary;
	 Professor(String name, int age, String subject, double salary) {
	     super(name, age);
	     this.subject = subject;
	     this.salary = salary;
	 }
	 void getRoleInfo() {
	     System.out.println("Professor Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Subject: " + subject);
	     System.out.println("Salary: " + salary);
	 }
	}
	class TeachingAssistant extends Student {
	 String assignedSubject;
	 TeachingAssistant(String name, int age, String course, int rollNo, String assignedSubject) {
	     super(name, age, course, rollNo);
	     this.assignedSubject = assignedSubject;
	 }
	 void getRoleInfo() {
	     System.out.println("Teaching Assistant Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Course: " + course);
	     System.out.println("Roll No: " + rollNo);
	     System.out.println("Assigned Subject: " + assignedSubject);
	 }
	}
	public class Teacher {
	    public static void main(String[] args) {
	        Person s = new Student("Yugandhar", 20, "B.Tech", 101);
	        Person p = new Professor("Girish", 45, "Mathematics", 75000);
	        Person t = new TeachingAssistant("Sandhya", 22, "M.Sc", 201, "Physics");
	        System.out.println("=== Student Info ===");
	        s.getRoleInfo();
	        System.out.println("\n=== Professor Info ===");
	        p.getRoleInfo();
	        System.out.println("\n=== Teaching Assistant Info ===");
	        t.getRoleInfo();
	    }
	}
