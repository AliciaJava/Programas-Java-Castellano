/**
 * 1. Salida por pantalla
 *
 * 5. Modifica el programa anterior añadiendo colores. Puedes mostrar
 *    cada asignatura de un color diferente.
 *
 * @AliciaJava
 */
package SalidaDatosPantalla;


public class HorarioClaseColores {
    
    public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(naranja + "Lunes\tMartes\tMierc.\tJueves\tViernes");
    System.out.println("======\t=======\t======\t======\t=======");
    System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
    System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
    System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
  }
    
}
