package ejercicio11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {

	public static void main(String[] args) {
		Path archivo = Paths.get("misArchivos", "textos", "meses_copia.txt");

		try {
			List<String> lineas = Files.readAllLines(archivo);
			System.out.println("Contenido del archivo:");
			for (String linea : lineas) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
