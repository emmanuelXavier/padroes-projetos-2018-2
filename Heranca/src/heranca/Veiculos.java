package heranca;

public abstract class Veiculos {
    
    private String nome;
    
    public void locomover(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //ante
        this.nome = nome;
        //depois
    }
    
    
    public abstract void ligar();
    
    
    
}
