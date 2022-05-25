package Practice;

public class Employee {

	String employeeName;
	double hoursWorked;
	double hourlyRate;
	double pay;
	double overTime;

	public Employee(String name, double hours, double rate) {

		employeeName = name;
		hoursWorked = hours;
		hourlyRate = rate;
  
	}

	public double grossPay() {

		if (hoursWorked <= 40) {
			pay = hoursWorked * hourlyRate;
		} else if (hoursWorked <= 60 && hoursWorked > 40) {
			overTime = hoursWorked - 40;
			pay = 40 * hourlyRate + (overTime * (1.5 * hourlyRate));
		} else {
			System.out.println("number of hours worked should not exceed 60 hours");
		}
		return pay;
	}
}
