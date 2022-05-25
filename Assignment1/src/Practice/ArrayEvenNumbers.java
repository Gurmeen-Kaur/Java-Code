package Practice;

public class ArrayEvenNumbers {
	public static void main(String[] args) {

		int[] evenNumbersArray = new int[10];
		for (int i = 0; i < evenNumbersArray.length; i++) {
			if (i == 0) {
				evenNumbersArray[i] = 2;
			} else {
				// get the value at previous index, add 2 to it and store it at current index
				int temp = evenNumbersArray[i - 1];
				evenNumbersArray[i] = temp + 2;
			}

			System.out.println(evenNumbersArray[i]);

		}
		int number = 14;
		for (int i = 0; i < evenNumbersArray.length; i++) {
			if (evenNumbersArray[i] == number) {
				System.out.println("Value found at "+i);
				break;
			} else {
				System.out.println("value doesn't exist");
			}
		}
		//int[] evenNumbers = new int[10];

		//		int j = 0;
		//
		// for(int i=0;i<evenNumbers.length;i++) {
		// j=j+2;
		// evenNumbers[i]=j;
		// System.out.println(evenNumbers[i]);

	}

}
