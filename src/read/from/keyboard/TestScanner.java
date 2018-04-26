package read.from.keyboard;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		System.out.println("Escribe!");
		
		try (Scanner input = new Scanner(System.in)){
			String smt = input.nextLine();
			System.out.println(smt);
		}
		
		System.out.println("Fin del progrmaa");
	}

}
