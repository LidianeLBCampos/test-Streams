package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextScanner {

	public static void main(String[] args) throws IOException {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("test1.txt"))) {
			String row;
			while((row = reader.readLine()) != null) {
				System.out.println(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
