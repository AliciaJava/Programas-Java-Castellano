# Programas en Java para Practicar

Este repositorio contiene una serie de programas en **Java puro** diseñados para practicar conceptos fundamentales de programación. Los programas abordan temas clave como **bucles**, **cálculo de la circunferencia**, **condicionales**, **lectura de datos desde el teclado**, **salida de datos**, y **variables**.

## Objetivos del Proyecto

El propósito de estos programas es permitir a los estudiantes y programadores novatos practicar y reforzar sus conocimientos de programación en Java, enfocándose en conceptos básicos esenciales para el desarrollo de software.

## Programas Incluidos

### 1. **Bucles**
   - **Descripción**: Programas que muestran el uso de bucles **for**, **while** y **do-while** para realizar tareas repetitivas como la iteración a través de números, la suma de elementos, etc.
   - **Ejemplo**:
     ```java
     // Imprimir los números del 1 al 10 usando un bucle for
     for (int i = 1; i <= 10; i++) {
         System.out.println(i);
     }
     ```

### 2. **Cálculo de la Circunferencia**
   - **Descripción**: Este programa calcula el área y la longitud de una circunferencia dada su radio. Utiliza la fórmula matemática `A = π * r^2` para el área y `C = 2 * π * r` para la longitud.
   - **Ejemplo**:
     ```java
     import java.util.Scanner;

     public class Circunferencia {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Introduce el radio de la circunferencia: ");
             double radio = scanner.nextDouble();
             
             double area = Math.PI * Math.pow(radio, 2);
             double longitud = 2 * Math.PI * radio;

             System.out.println("Área de la circunferencia: " + area);
             System.out.println("Longitud de la circunferencia: " + longitud);
         }
     }
     ```

### 3. **Condicionales**
   - **Descripción**: Programas que muestran cómo usar estructuras condicionales como **if**, **else if**, y **switch** para tomar decisiones basadas en el valor de las variables.
   - **Ejemplo**:
     ```java
     int numero = 10;

     if (numero > 0) {
         System.out.println("El número es positivo.");
     } else if (numero < 0) {
         System.out.println("El número es negativo.");
     } else {
         System.out.println("El número es cero.");
     }
     ```

### 4. **Lectura de Teclado**
   - **Descripción**: Programas que permiten al usuario ingresar datos desde el teclado utilizando la clase `Scanner`. Estos datos pueden ser números, cadenas de texto, etc.
   - **Ejemplo**:
     ```java
     import java.util.Scanner;

     public class LecturaTeclado {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             
             System.out.print("Introduce tu nombre: ");
             String nombre = scanner.nextLine();
             
             System.out.println("Hola, " + nombre + "!");
         }
     }
     ```

### 5. **Salida de Datos**
   - **Descripción**: Programas que muestran cómo imprimir datos en la consola utilizando las funciones `System.out.print()` y `System.out.println()`.
   - **Ejemplo**:
     ```java
     System.out.println("¡Bienvenido al programa de práctica!");
     System.out.print("Este es un mensaje sin salto de línea.");
     ```

### 6. **Variables**
   - **Descripción**: Programas que utilizan variables para almacenar y manipular datos. Los tipos de datos incluyen enteros, decimales, cadenas de texto, y booleanos.
   - **Ejemplo**:
     ```java
     int numero = 5;
     double pi = 3.1416;
     String mensaje = "Hola, Mundo!";
     boolean esValido = true;
     
     System.out.println("Número: " + numero);
     System.out.println("Pi: " + pi);
     System.out.println("Mensaje: " + mensaje);
     System.out.println("¿Es válido? " + esValido);
     ```

## Requisitos

Para ejecutar los programas, asegúrate de tener el **JDK 8 o superior** instalado en tu sistema.

- **JDK 8 o superior**: [Descargar JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **IDE Java** (Recomendado): Eclipse, IntelliJ IDEA, NetBeans, o cualquier editor de texto con soporte para Java.

## Instalación

1. Clona el repositorio en tu máquina local:

   ```bash
   git clone https://github.com/usuario/programas-java-practica.git

# Uso de los Programas

Los programas se pueden ejecutar de forma independiente. A continuación, se describen algunos ejemplos de cómo usar los programas incluidos:

## 1. Ejecutar el Programa de Cálculo de Circunferencia

Para ejecutar el programa que calcula la circunferencia, sigue estos pasos:

1. Ejecuta el archivo `Circunferencia.java`.
2. El programa te pedirá que ingreses el radio de la circunferencia.
3. Después de ingresar el valor, el programa calculará y mostrará la circunferencia.

```bash
java Circunferencia
