import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main (String args[]) {
		
		File rutaInicial = new File("D:\\PRUEBAS");
		File nuevoDirectorio = new File(rutaInicial, "AD");
		
		nuevoDirectorio.mkdir();
		
		//Creación de ficheros
		File nuevoFichero = new File(nuevoDirectorio, "datos.txt");
			try {
				nuevoFichero.createNewFile();
			} catch (IOException e) {
				
				System.out.println("Ruta no encontrada");
			}	
		
	}

}
