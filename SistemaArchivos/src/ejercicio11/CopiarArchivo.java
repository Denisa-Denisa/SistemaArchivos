package ejercicio11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopiarArchivo {

	public static void main(String[] args) {
		Path archivo = Paths.get("misArchivos", "meses.txt");
		Path destino = Paths.get("misArchivos", "textos", "meses_copia.txt");

		try {
			Files.createDirectories(destino.getParent());
			Files.copy(archivo, destino);
			System.out.println("Archivo copiado: " + destino);
		} catch (Exception e) {
			System.out.println("Error al copiar el archivo: " + archivo);
		}
	}
}
