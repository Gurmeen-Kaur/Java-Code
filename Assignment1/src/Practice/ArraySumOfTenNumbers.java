package Practice;

public class ArraySumOfTenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;

			sum = sum + array[i];

		}
		System.out.println("Sum of ten numbers is "+sum);
	}

}