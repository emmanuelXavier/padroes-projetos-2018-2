package herancaxassociacao;

/**
 *
 * @author xavier
 */
public class DesenhoAssocicao {
    
    private Figura figura;
    
    public DesenhoAssocicao(Figura obj){
        figura = obj;
    }
    
    public void apresentarDesenho(){
        figura.desenhar();
    }
    
    public void setFigura(Figura obj){
        this.figura = obj;
    }
    
}
