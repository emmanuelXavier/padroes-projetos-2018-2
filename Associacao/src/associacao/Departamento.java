package associacao;


public class Departamento {
    private String nome;
    private Professor coordenador = new Professor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
    
    
    public void salvar(){
        
    }
    
}
