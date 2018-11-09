package strategy;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conector {
    
    private Banco banco;
    
    
    public Conector(String strategy){
        
        try {

            this.banco = (Banco) Class.forName("strategy." + strategy).newInstance();
            
           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Classe não existe");
        }
        catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Classe Erro de instanciação");
        } catch (IllegalAccessException ex) {
             JOptionPane.showMessageDialog(null, "Sem permissão");
        }
                
    }
    
    
    public void conectarBanco(){
        banco.conectar();
    }
    
}
