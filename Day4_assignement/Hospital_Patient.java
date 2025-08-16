package Day4_assignement;

class Hospital {
	 String hospitalName = "Govt Hospital";
	 String location = "Palakonda";

	 void showHospitalDetails() {
	     System.out.println("Hospital: " + hospitalName);
	     System.out.println("Location: " + location);
	 }
	}
	//Subclass
	class Patient extends Hospital {
	 String patientName = "Charwin";

	 void showPatientDetails() {
	     System.out.println("Patient Name: " + patientName);
	 }
	}
	public class Hospital_Patient {
	 public static void main(String[] args) {
	     Patient p = new Patient();
	     p.showPatientDetails();
	     p.showHospitalDetails(); 
	 }
	}