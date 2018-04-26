package data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in);
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("survey.dat"))) {
			System.out.println("E N C U E S T A");

			System.out.println("Nombre: ");
			String name = input.nextLine();

			System.out.println("Edad: ");
			int edad = input.nextInt();

			System.out.println("Altura: ");
			double altura = input.nextDouble();

			System.out.println("Descansa bien: ");
			boolean descansa = input.nextBoolean();

			dos.writeUTF(name);
			dos.writeInt(edad);
			dos.writeDouble(altura);
			dos.writeBoolean(descansa);

			dos.writeLong(getCurrentDate());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static long getCurrentDate() {
		LocalDate today = LocalDate.now();
		String tmp = today.getYear() + "";
		tmp += today.getMonthValue() < 10 ? "0" + today.getMonthValue() : today.getMonthValue();
		tmp += today.getDayOfMonth() < 10 ? "0" + today.getDayOfMonth() : today.getDayOfMonth();
		return Integer.parseInt(tmp);
	}

}
