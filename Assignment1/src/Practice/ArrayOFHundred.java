package Practice;

import java.util.Scanner;

public class ArrayOFHundred {
	public static void main(String[] args) {

		int[] array = new int[100];
		for (int i=0;i<100;i++) {
			array[i]=i+1;
		}
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int inputFromUser = scanner.nextInt();

		for (int i = 1; i <= inputFromUser;i++) {

			System.out.println(i);
			array[i]++;
			scanner.close();
		}

	}

}