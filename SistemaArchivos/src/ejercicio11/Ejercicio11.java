package ejercicio11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Ejercicio11 {

	public static void main(String[] args) {

		Path archivo = Paths.get("misArchivos", "meses.txt");
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		try {
			Files.write(archivo, String.join("\n", meses).getBytes());
			System.out.println("Archivo creado: " + archivo);

			BasicFileAttributes atributos = Files.readAttributes(archivo, BasicFileAttributes.class);
			System.out.println("Atributos:");
			System.out.println("  Último acceso: " + atributos.lastAccessTime());
			System.out.println("  Última modificación: " + atributos.lastModifiedTime());
			System.out.println("  Tamaño: " + atributos.size() + " bytes");
			System.out.println("  Es directorio: " + atributos.isDirectory());
			System.out.println("  Es archivo: " + atributos.isRegularFile());
			System.out.println("  Es enlace simbólico: " + atributos.isSymbolicLink());
		} catch (Exception e) {
			System.out.println("Error al crear el archivo: " + archivo);
		}
	}

}
