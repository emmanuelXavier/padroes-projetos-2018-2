/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public class SqlServer extends Banco{
    
    public void conectar(){
        JOptionPane.showMessageDialog(null, "Conexão SQL SERVER realizada com sucesso");
    }
    
}
