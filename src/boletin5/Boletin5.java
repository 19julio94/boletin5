

package boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin5 {

    
    public static void main(String[] args) {
Coche coche1=new Coche();

JOptionPane.showMessageDialog(null,"La velocidad inicial es= "+coche1.getVelocidade());
coche1.Setacelerar(24);
JOptionPane.showMessageDialog(null,"La velocidad en aceleracion es= "+coche1.getVelocidade());
coche1.Setfrenar(6);
JOptionPane.showMessageDialog(null,"La velociad en frenado es= "+coche1.getVelocidade());

        
        
    }
    
}
