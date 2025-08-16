//	3. write a program for driving license eligibility
//	* age must be greater than equal to 18
//	* must have passed the driving test*/

package Day1_assignemment;

public class DrivingLicenseEligibility {
	public static void main(String[] args) {
		int age = 17;
		boolean hasPassedTest = true;

		if (age >= 18) {
			if (hasPassedTest) {
				System.out.println("Eligible for Driving License");
			} else {
				System.out.println("Not Eligible: Did not pass the driving test");
			}
		} else {
			System.out.println("Not Eligible: Age must be 18 or above");
		}
	}
}