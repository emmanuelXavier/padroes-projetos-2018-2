package herancaxassociacao;


public class HerancaXAssociacao {

  
    public static void main(String[] args) {
        //Herança
       // Desenho des = new Desenho();
        //des.apresentarDesenho();
        
        //Associcao
        DesenhoAssocicao des = new DesenhoAssocicao(new Quadrado());
        des.apresentarDesenho();
        des.setFigura(new Circulo());
        des.apresentarDesenho();
    }
    
}
