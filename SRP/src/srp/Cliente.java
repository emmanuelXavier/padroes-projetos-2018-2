package srp;

public class Cliente {
    
    private int id;
    private String nome;
    private Cpf cpf;
    
    
   public void setCpf(Cpf cpf){
       this.cpf = cpf;
   }
    
    
    public void salvar(){
        
        //code
        //validarCPf
        
        cpf.validarCPF();
        //code
    }
    
    
}
