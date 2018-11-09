
package singleton;

/**
 *
 * @author xavier
 */
public class ConexaoSingleton {
    
    private static ConexaoSingleton instancia;
    
    private ConexaoSingleton(){
        
    }
    
    public static ConexaoSingleton instanciar(){
        if (instancia == null)
            instancia = new ConexaoSingleton();
        return instancia;
    }
    
}
