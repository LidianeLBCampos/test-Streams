package read.from.keyboard;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeyBoard {

	public static void main(String[] args) throws IOException {
		InputStreamReader keyBoard = new InputStreamReader(System.in);

		System.out.println("Pulsa una tecla");
		int t;
		while ((t = keyBoard.read()) != 13)
			System.out.print((char) t);
		
		System.out.println("\nfin de programa");
		
		keyBoard.close();

	}
	

}
