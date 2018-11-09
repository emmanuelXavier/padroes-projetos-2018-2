package srp;

public class ContasReceber {
    
    private int id;
    private Cpf cpfCliente;
    private double valor;
    
    public boolean salvar(){
        //code
        
        return true;
    }
    
    public void setCpf(Cpf cpf){
        if (cpf.validarCPF())
            cpfCliente = cpf; 
    }
    
   
    
}
