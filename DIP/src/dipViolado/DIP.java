package dipViolado;

import dip.Adapter;
import dip.Botao;
import dip.Celular;
import dip.Lampada;

public class DIP {
 
    public static void main(String[] args) {
        Botao botao = new Botao();
        botao.acionar(new Adapter());
    }
    
}
