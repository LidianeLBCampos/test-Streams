package a_file_class;

import java.io.File;
import java.io.FilenameFilter;

public class FileClassFilter {
	static final String USER_DIR = System.getProperty("user.dir");

	public static void main(String[] args) {
		File carp = new File(USER_DIR);
		boolean continuar = carp.exists() && carp.isDirectory();

		if (continuar) {
			System.out.println("contenido de la carpeta" + carp.getPath());
			
			
			String[] contenido = carp.list((dir, name) -> name.endsWith(".txt"));
			for (String item : contenido)
				System.out.println(item);
		}

		System.out.println("Programa Finalizado");
	}

}

