package Practice;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] array = new String[] { "Ford", "Tata", "Hyundai", "Honda", "Acura", "Lexus", "Toyota", "Nissan",
				"Mercedes", "Ferrari" };
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter a car name");
		String inputFromUser = scanner.next();
		
		boolean valueFound =false;
		//finding if array contains Acura
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(inputFromUser))
			{
				valueFound=true;
				break;
			}
			//else {
				//System.out.println("array doesnt contain word");
		//	}
			//System.out.println(i);
			//System.out.println(array[i]);
		}
		if(valueFound) {
			System.out.println("Car is present in the list");
		}
		else{
			System.out.println("Car is not in the list");
		}
		scanner.close();
		}
	
		}
