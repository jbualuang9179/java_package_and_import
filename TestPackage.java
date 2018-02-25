package student.register;
import student.exam.*;

public class TestPackage {
	public static void main(String[] args) {
		new Enrollment().enroll();
		new Withdrawal().withdraw();
		new Grade().calGrade();
		new Points().calPoints();
	}
}