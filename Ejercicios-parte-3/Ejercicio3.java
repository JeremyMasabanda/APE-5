import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Modo append activado al pasar 'true' como segundo argumento
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt", true));
            
            bw.newLine();
            bw.write("Estructura de Datos");
            bw.newLine();
            bw.write("Álgebra Lineal");
            
            bw.close();
            System.out.println("Nuevas asignaturas agregadas al final del archivo sin sobrescribir.");
        } catch (IOException e) {
            System.out.println("Error al intentar modificar el archivo.");
            e.printStackTrace();
        }
    }
}
