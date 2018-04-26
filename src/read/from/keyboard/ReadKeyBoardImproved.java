package read.from.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeyBoardImproved {

	public static void main(String[] args) throws IOException {
		// InputStreamReader keyBoard = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Escribe!");
		String row = reader.readLine();

		System.out.println(row);

		System.out.println("\nfin de programa");

	}

}
