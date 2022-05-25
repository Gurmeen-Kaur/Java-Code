package Practice;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Gurmeen", 40, 22);
		Employee employee2 = new Employee("Wiolet", 48, 24);
		Employee employee3 = new Employee("Jijo", 55, 25);

		System.out.println("Gross pay of first employee is " + employee1.grossPay());
		System.out.println("Gross pay of second employee is " + employee2.grossPay());
		System.out.println("Gross pay of third employee is " + employee3.grossPay());

	}

}
