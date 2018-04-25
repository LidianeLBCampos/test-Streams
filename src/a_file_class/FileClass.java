package a_file_class;

import java.io.File;

public class FileClass {
	static final String USER_DIR = System.getProperty("user.dir");

	public static void main(String[] args) {
		File carp = new File(USER_DIR);
		boolean continuar = carp.exists() && carp.isDirectory();

		if (continuar) {
			System.out.println("contenido de la carpeta" + carp.getPath());
			procesar(carp);
		}

		System.out.println("Programa Finalizado");
	}

	private static void procesar(File carp) {
		File[] contenido = carp.listFiles();
		for (File file : contenido) {
			if (file.isFile()) {
				System.out.println(file.getName());
			} else {
				System.out.println("[D]---" + file.getName());
				procesar(file);
			}
		}
	}

}
