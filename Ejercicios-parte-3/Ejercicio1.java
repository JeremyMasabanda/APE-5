import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        if (archivo.exists()) {
            System.out.println("El archivo ya existe en el sistema.");
        } else {
            try {
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("Archivo creado exitosamente.");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al intentar crear el archivo.");
                e.printStackTrace();
            }
        }

        // Consultar metadatos del archivo
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
    }
}
