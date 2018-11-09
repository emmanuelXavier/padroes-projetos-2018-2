/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp;

/**
 *
 * @author xavier
 */
public class Cpf {
    
    private String valor;
    private String estado;
    
    public Cpf (String cpf){
        this.valor = cpf;
    }
    
    public String get(){
        return valor;
    }
    
    public boolean validarCPF(){
        
        if (estado.equals(""))
            return false;
        
        return true;
    }
    
    
    
}
