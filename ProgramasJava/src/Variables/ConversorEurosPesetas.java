/**
 * 2. Variables
 *
 * 4. Realiza un conversor de euros a pesetas. La cantidad en euros que
 *    se quiere convertir deberá estar almacenada en una variable.
 *
 * @AliciaJava
 */
package Variables;


public class ConversorEurosPesetas {
    
    public static void main(String[] args) {
    
    double euros = 6.00;
    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
    
}
