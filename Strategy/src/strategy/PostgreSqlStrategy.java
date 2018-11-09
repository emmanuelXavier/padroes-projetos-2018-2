package strategy;

import javax.swing.JOptionPane;

public class PostgreSqlStrategy extends Banco {
    
    public void conectar(){
        JOptionPane.showMessageDialog(null, "Conexão PostgreSql realizada com sucesso");
    }
    
}
