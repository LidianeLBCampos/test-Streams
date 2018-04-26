package reader;

import java.io.File;
import java.util.Scanner;

public class ReadTextBuffer {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(new File("test1.txt"))) {
			while (input.hasNextLine()) {
				String row = input.nextLine();
				System.out.println(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
