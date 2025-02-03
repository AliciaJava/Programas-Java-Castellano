
/**
 * @AliciaOrtega 2024
 */

package SalidaDatosPantalla;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MiPrimerGUI {
    
public static void main(String[] args) {
// Defino la accion a ejecutar
Action action = new AbstractAction("Hola mundo") {
@Override
public void actionPerformed(ActionEvent evt) {
System.out.println("Hola mundo");
}
};
JButton button = new JButton(action);
JFrame frame = new JFrame();
// Añado el boton al marco
frame.getContentPane().add(button,
BorderLayout.CENTER);

// Dimensiones del marco
int frameWidth = 100;
int frameHeight = 100;
frame.setSize(frameWidth, frameHeight);
// Muestro el marco
frame.setVisible(true);
// Le digo al frame que salga de la aplicacion
// cuando se cierre
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}