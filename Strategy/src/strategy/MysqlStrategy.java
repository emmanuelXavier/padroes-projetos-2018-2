package strategy;

import javax.swing.JOptionPane;


public class MysqlStrategy extends Banco {
    
    
    
    public void conectar(){
        JOptionPane.showMessageDialog(null, "Conexão Mysql realizada com sucesso");
    }
    
}
