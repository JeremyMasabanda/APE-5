import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt"));
            
            bw.write("Programación");
            bw.newLine();
            bw.write("Base de Datos");
            bw.newLine();
            bw.write("Matemáticas");
            bw.newLine();
            bw.write("Física");
            bw.newLine();
            bw.write("Inglés");
            
            bw.close();
            System.out.println("Archivo 'materias.txt' generado exitosamente con 5 asignaturas.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
