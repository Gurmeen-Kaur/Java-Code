package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class ArrarOfTenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements required");

		int sizeOfArray = scanner.nextInt();
		int[] newArray = new int[sizeOfArray];
		int sum = 0;
		System.out.println("Enter the numbers");

		for (int i = 0; i < sizeOfArray; i++) {
			newArray[i] = scanner.nextInt();

			sum = sum + newArray[i];

		}
		System.out.println("Elements of array are :" + Arrays.toString(newArray));
		System.out.println("Sum of the array is :" + sum);
		scanner.close();
	}
}
