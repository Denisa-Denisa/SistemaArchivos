package ejercicio11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio12 {

	public static void main(String[] args) throws IOException {

		// Crea una carpeta llamada misArchivos
		System.out.println();
		Mensaje.titulo("CREAR ARCHIVO");
		Path ruta = Paths.get("misArchivos");
		try {
			Path ruta2 = Files.createDirectories(ruta);
			System.out.printf("Directorio \"%s\" creado.%n", ruta2);
		} catch (IOException e) {
			System.out.println("Error al crear el directorio.");
			e.printStackTrace();
		}

		// Crea un archivo de texto llamado "meses.txt" con los meses del año. Un mes
		// por fila.
		try {
			FileWriter fw = new FileWriter("misArchivos/meses.txt");
			fw.write("Enero\n");
			fw.write("Febrero\n");
			fw.write("Marzo\n");
			fw.write("Abril\n");
			fw.write("Mayo\n");
			fw.write("Junio\n");
			fw.write("Julio\n");
			fw.write("Agosto\n");
			fw.write("Septiembre\n");
			fw.write("Octubre\n");
			fw.write("Noviembre\n");
			fw.write("Diciembre\n");
			fw.close();
			System.out.println("Archivo creado correctamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo.");
			e.printStackTrace();
		}

		// Escribe los atributos del archivo (lectura, escritura, tamaño, etc.)
		String rutaArchivo = "misArchivos/meses.txt";
		Path pathArchivo = Paths.get(rutaArchivo);
		File archivo = pathArchivo.toFile();

		// Obtener los atributos del archivo
		System.out.println("Atributos del archivo:");
		System.out.println("  Lectura: " + archivo.canRead());
		System.out.println("  Escritura: " + archivo.canWrite());
		System.out.println("  Tamaño: " + archivo.length() + " bytes");

		// Haz una copia del archivo en la subcarpeta "textos"
		String rutaCarpeta = "misArchivos/textos";
		String rutaCopia = "misArchivos/textos/meses_copia.txt";
		Path pathCarpeta = Paths.get(rutaCarpeta);
		Path pathCopia = Paths.get(rutaCopia);

		try {
			File carpeta = new File(rutaCarpeta);
			if (!carpeta.exists()) {
				carpeta.mkdirs();
			}

			Files.copy(pathArchivo, pathCopia);

			System.out.println("Copia del archivo creada.");

		} catch (IOException e) {
			System.out.println("Error al crear la copia del archivo.");
			e.printStackTrace();
		}

	}
}