package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[5];

		System.out.println("Enter the word");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		for (int i = 1; i < array.length; i++) {
			if (input != null) {

				array[i] = scanner.next();
			} else {
				System.out.println("Please enter a valid input");
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
