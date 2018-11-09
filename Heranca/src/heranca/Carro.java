/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public class Carro extends Veiculos{
    
    private String marca;
    
    
    
    public Carro(){
        this.setNome("d");
        JOptionPane.showMessageDialog(null, this.getNome());
        this.locomover();
    }
    
    public void ligar(){
        
    }
  
    
    public void locomover(int metros){
        
    }
    
}
