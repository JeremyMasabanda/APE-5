import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        // Se incluyen Scanner y BufferedWriter en el try para cerrarlos automáticamente
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt"))) {
            
            for (int i = 1; i <= 3; i++) {
                System.out.println("Estudiante " + i + ":");
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la calificación: ");
                double calificacion = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                writer.write("Nombre: " + nombre);
                writer.newLine();
                writer.write("Calificación: " + calificacion);
                writer.newLine();
            }
            System.out.println("Datos guardados exitosamente en estudiantes.txt");
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
}
