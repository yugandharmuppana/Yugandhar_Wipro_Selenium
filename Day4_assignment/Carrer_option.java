package Day4_assignement;

//Superclass
class After12th {
	void show() {
		System.out.println("Available career options after 12th:");
	}
}
//Child class 1
class Engineering extends After12th {
	void engCourses() {
		System.out.println("Engineering courses: IT, Mechanical, CS");
	}
}
//Child class 2
class Medical extends After12th {
	void medCourses() {
		System.out.println("Medical courses: MBBS, BDS");
	}
}
//Child class 3
class OtherCourses extends After12th {
	void otherCourses() {
		System.out.println("Other courses: BBA, BCA");
	}
}
public class Carrer_option {
	public static void main(String[] args) {
		Engineering eng = new Engineering();
		Medical med = new Medical();
		OtherCourses other = new OtherCourses();
		eng.show();
		eng.engCourses();
		med.medCourses();
		other.otherCourses();
	}
}