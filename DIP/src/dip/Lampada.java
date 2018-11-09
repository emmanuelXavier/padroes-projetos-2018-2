
package dip;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public class Lampada implements Dispositivo{
    public void ligar(){
        JOptionPane.showMessageDialog(null, "Lâmpada ligada");
    }
    
}
