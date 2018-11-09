package dip;


public class Adapter implements Dispositivo{
    
    private DataShow datashow = new DataShow();
    
    public void ligar(){
        datashow.ativar();
    }
    
}
