package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadText {

	public static void main(String[] args) {

		Reader reader = null;
		try {
			reader = new FileReader("test1.txt");

			int b;
			while ((b = reader.read()) != -1) {
				System.out.print((char) b);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
		}
	}

}
