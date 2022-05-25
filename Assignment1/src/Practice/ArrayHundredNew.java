package Practice;

import java.util.Scanner;

public class ArrayHundredNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;  // it is assigning value 
			//System.out.println("i=" + i + "  value=" + array[i]);
		}
		System.out.println(array[31]);
		array[31] = 120;
		System.out.println(array[31]);
		// Scanner scanner=new Scanner(System.in);
		if (array[98] == 99) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}