package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter five numbers");
		// int inputFromUser = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int[] array2 = Arrays.copyOf(array, array.length);

		System.out.println("Array 1 is : " + Arrays.toString(array));
		System.out.println("Array 2 is : " + Arrays.toString(array2));
		scanner.close();
	}

}
