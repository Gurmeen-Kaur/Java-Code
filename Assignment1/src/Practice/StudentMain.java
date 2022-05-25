package Practice;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		Student thirdStudent = new Student();
		Student fourthStudent = new Student();

		firstStudent.name = "Early Bird";
		firstStudent.rollNumber = 1;

		secondStudent.name = "Class Nerd";
		secondStudent.rollNumber = 2;

		thirdStudent.name = "Prom Queen";
		thirdStudent.rollNumber = 3;

		fourthStudent.name = "Scared Guy";
		fourthStudent.rollNumber = 4;

		System.out.println("name of the student is "+firstStudent.getName());
		
		firstStudent.setName();
		
	}

}
