# APE-5

## Práctica de Manejo de Archivos en Java

# Ejercicio 1: Crear un fichero en Java

Enunciado: Desarrollar un programa en Java que permita crear un archivo de texto llamado curso.txt.

Indicaciones principales:

Importar las clases necesarias para trabajar con archivos (java.io.File, java.io.IOException).

Crear un objeto de tipo File.

Utilizar el método createNewFile() para crear el archivo físico.

Comprobar condicionalmente si el archivo se creó correctamente o si ya existía previamente.

Mostrar el nombre del archivo utilizando el método getName().

Utilizar una estructura try-catch para controlar posibles errores de E/S (Input/Output).

# Ejercicio 2: Escribir información en un fichero

Enunciado: Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado estudiantes.txt.

Indicaciones principales:

Importar las clases necesarias (java.util.Scanner, java.io.FileWriter, java.io.IOException).

Crear un objeto Scanner para capturar la entrada de información por teclado.

Solicitar al usuario que escriba un mensaje.

Utilizar FileWriter para abrir el archivo estudiantes.txt.

Pasar el parámetro true en el constructor del FileWriter (modo append) para conservar la información anterior y agregar el nuevo mensaje al final del archivo.

Utilizar el método write() para guardar el mensaje y cerrar el flujo de datos mediante close().

Mostrar un mensaje por consola indicando que la información se guardó correctamente, controlando los errores con bloques try-catch.

Nota: El archivo estudiantes.txt debe existir previamente para este ejercicio.

# Ejercicio 3: Eliminar un fichero en Java

Enunciado: Desarrollar un programa en Java que permita eliminar el archivo de texto estudiantes.txt.

Indicaciones principales:

Importar la clase necesaria (java.io.File).

Crear un objeto de tipo File indicando explícitamente el nombre del archivo que se desea borrar (estudiantes.txt).

Utilizar el método delete() para intentar eliminar el archivo del sistema.

Comprobar el resultado mediante una estructura condicional (if-else).

Si el archivo se eliminó exitosamente, mostrar un mensaje de confirmación; de lo contrario, mostrar un aviso indicando que ocurrió un problema

## Ejercicios clase 2

## Ejercicio 1: Registro de estudiantes y calificaciones

Enunciado: Desarrollar un programa en Java que permita registrar los datos de 3 estudiantes y guardar la información en un archivo llamado estudiantes.txt.

Indicaciones principales:

Solicitar el nombre del estudiante. 

Solicitar su calificación. 

Guardar ambos datos en el archivo. 

Cada estudiante debe ocupar dos líneas. 

Utilizar Scanner, BufferedWriter y FileWriter. 

Cerrar correctamente el archivo.

## Ejercicio 2: Registro de productos con modo Append

Enunciado: Desarrollar un programa que permita registrar productos en un archivo llamado productos.txt.

Indicaciones principales:

Solicitar el nombre del producto. 

Solicitar su precio.
  
Solicitar la cantidad disponible.

Calcular el valor total del producto (precio × cantidad). 

Guardar los resultados en el archivo.

Permitir registrar nuevos productos sin borrar los registros anteriores. 

Utilizar BufferedWriter y modo append. 


## Ejercicio 3: Sistema de registro de ventas 

Enunciado: Desarrollar un programa en Java que permita registrar las ventas de una tienda y guardar la información en un archivo llamado ventas.txt.

Indicaciones Principales:

Solicitar el nombre del producto. 

Solicitar el precio y la cantidad vendida.

Calcular el subtotal de cada venta. 

Si el subtotal es mayor o igual a $100, aplicar un descuento del 10%. 

Mostrar el total a pagar. 

Permitir registrar varios productos hasta que el usuario escriba fin.

Guardar cada venta en el archivo sin eliminar los registros anteriores. 

Al finalizar, guardar el total acumulado de las ventas realizadas. 
