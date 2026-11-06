


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (BufferedWriter escritor = new BufferedWriter(
                new FileWriter("productos.txt", true))) {

            System.out.println("=== REGISTRO DE PRODUCTOS ===");

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();

            double precio;

            while (true) {
                try {
                    System.out.print("Ingrese el precio: ");
                    precio = Double.parseDouble(
                            sc.nextLine().replace(',', '.'));

                    if (precio < 0) {
                        System.out.println("El precio no puede ser negativo.");
                        continue;
                    }

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un precio valido.");
                }
            }

            int cantidad;

            while (true) {
                try {
                    System.out.print("Ingrese la cantidad disponible: ");
                    cantidad = Integer.parseInt(sc.nextLine());

                    if (cantidad < 0) {
                        System.out.println("La cantidad no puede ser negativa.");
                        continue;
                    }

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Ingrese una cantidad valida.");
                }
            }

            double total = precio * cantidad;

            escritor.write("Producto: " + nombre);
            escritor.newLine();

            escritor.write("Precio: $" + precio);
            escritor.newLine();

            escritor.write("Cantidad: " + cantidad);
            escritor.newLine();

            escritor.write("Valor total: $" + total);
            escritor.newLine();

            escritor.write("------------------------------");
            escritor.newLine();

            System.out.println("\n=== RESUMEN DEL PRODUCTO ===");
            System.out.println("Producto: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor total: $" + total);

            System.out.println("\nProducto guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }

        sc.close();
    }
}

