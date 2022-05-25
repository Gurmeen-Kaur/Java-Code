package Practice;

import java.util.Scanner;

public class amusementParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter height of the kid in cm");
		double enteredHeight=scanner.nextDouble();
		
		System.out.println("Please enter weight of the kid in kg");
		double enteredWeight=scanner.nextDouble();
		
		amusementPark amusementpark= new amusementPark(enteredHeight,enteredWeight);
		
		System.out.println(amusementpark.conditionCheck());
		scanner.close();
	}

}
