

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalAcumulado = 0;

        try (BufferedWriter escritor = new BufferedWriter(
                new FileWriter("ventas.txt", true))) {

            System.out.println("=== SISTEMA DE REGISTRO DE VENTAS ===");
            System.out.println("Escriba 'fin' para terminar.");

            while (true) {

                System.out.print("\nNombre del producto: ");
                String nombre = sc.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                if (nombre.trim().isEmpty()) {
                    System.out.println("El nombre no puede estar vacio.");
                    continue;
                }

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
                        System.out.print("Ingrese la cantidad vendida: ");
                        cantidad = Integer.parseInt(sc.nextLine());

                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                            continue;
                        }

                        break;

                    } catch (NumberFormatException e) {
                        System.out.println("Ingrese una cantidad valida.");
                    }
                }

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double total = subtotal - descuento;

                totalAcumulado += total;

                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: $" + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: $" + subtotal);
                escritor.newLine();

                escritor.write("Descuento: $" + descuento);
                escritor.newLine();

                escritor.write("Total a pagar: $" + total);
                escritor.newLine();

                escritor.write("------------------------------");
                escritor.newLine();

                System.out.println("\n=== RESUMEN DE VENTA ===");
                System.out.println("Producto: " + nombre);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);
            }

            escritor.write("TOTAL ACUMULADO DE LAS VENTAS: $"
                    + totalAcumulado);
            escritor.newLine();

            escritor.write("==============================");
            escritor.newLine();

            System.out.println("\n=== RESUMEN FINAL ===");
            System.out.println("Total acumulado: $" + totalAcumulado);
            System.out.println("Ventas guardadas en ventas.txt");

        } catch (IOException e) {
            System.out.println("Error al guardar las ventas: " + e.getMessage());
        }

        sc.close();
    }
}
