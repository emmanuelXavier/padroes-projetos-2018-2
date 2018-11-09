package encapsulamento;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        if (this.sexo == 'M')
            return "Sr " + nome;
        else 
            return "Sra " + nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    private void conectar(){
        
    }
    
    private void registrarLog(){
        
    }
    
    private void desconectar(){
        
    }
    
    public void salvar(){
        this.conectar();
        //code salvar
        this.registrarLog();
        this.desconectar();
    }
    
    
}
