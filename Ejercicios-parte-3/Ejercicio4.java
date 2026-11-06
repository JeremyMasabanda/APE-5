import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        File archivo = new File("datos/temporal.txt");

        try {
            // Pasos 1 y 2: Consultar y crear si no existe
            if (!archivo.exists()) {
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("Archivo 'temporal.txt' creado para la prueba.");
                }
            } else {
                System.out.println("El archivo ya existía previamente.");
            }

            // Pasos 3 y 4: Confirmación previa antes de eliminar
            boolean confirmarBorrado = true; // Simulación de confirmación del usuario

            if (confirmarBorrado) {
                boolean eliminado = archivo.delete();
                if (eliminado) {
                    System.out.println("El archivo fue eliminado exitosamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            } else {
                System.out.println("Operación de borrado cancelada por el usuario.");
            }

        } catch (IOException e) {
            System.out.println("Error de E/S durante la operación.");
            e.printStackTrace();
        }
    }
}
