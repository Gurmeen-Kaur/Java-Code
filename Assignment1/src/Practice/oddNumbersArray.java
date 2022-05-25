package Practice;

public class oddNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oddNumbers = new int[10];
		// method1
		oddNumbers[0] = 1;
		System.out.println(oddNumbers[0]);

		int n = 1;
		for (int i = 1; i < oddNumbers.length; i++) {
			n = n + 2;
			oddNumbers[i] = n;
			System.out.println(oddNumbers[i]);
		}

		// method2
		for (int i = 0; i < oddNumbers.length; i++) {
			if (i == 0) {
				oddNumbers[i] = 1;
			} else {
				int value = oddNumbers[i - 1];
				oddNumbers[i] = value + 2;
			}
			System.out.println("odd number value is " + oddNumbers[i]);
		}
	}

}
