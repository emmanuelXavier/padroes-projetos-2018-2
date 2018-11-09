package pkginterface;

public class Interface {

    public static void main(String[] args) {
        efetuarLogin(new Cliente());
        efetuarLogin(new Funcionario());
        efetuarLogin(new TI());
    }
    
    
    private static boolean efetuarLogin (Login obj){
        return obj.logar();
    }
    
}
