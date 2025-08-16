//		* 2. write a program for loan approval
//		* first check if salary>25000
//		* then check if credit score >=700

package Day1_assignemment;

public class LoanApproval {
	public static void main(String[] args) {
		double salary = 25000;
		int creditScore = 650;

		if (salary > 25000) {
			if (creditScore >= 700) {
				System.out.println("Loan Approved");
			} else {
				System.out.println("Loan Denied: Low Credit Score");
			}
		} else {
			System.out.println("Loan Denied: Salary too low");
		}

	}
}