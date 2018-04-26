package data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class Read {

	public static void main(String[] args) {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("survey.dat"))){
			
			System.out.println("Datos de la encuesta");
			System.out.println("Nombre: " + dis.readUTF());
			System.out.println("Edad: " + dis.readInt());
			System.out.println("Altura: " + dis.readDouble());
			System.out.println("Descansa bien: " + dis.readBoolean());
			System.out.println("Fecha: " + getDate(dis.readLong()));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static LocalDate getDate(long dateLong) {
		String date = dateLong + "";
		int year = Integer.parseInt(date.substring(0,4));
		int month = Integer.parseInt(date.substring(4,6));
		int day = Integer.parseInt(date.substring(6, 8));
		LocalDate dates= LocalDate.of(year, month, day);
		return dates;
	}

}
