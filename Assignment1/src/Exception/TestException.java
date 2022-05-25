package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("c://ExceptionMessage.txt");
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File not found");
		}
	}

}
