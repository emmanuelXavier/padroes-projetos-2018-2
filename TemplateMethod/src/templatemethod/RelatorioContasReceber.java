
package templatemethod;

/**
 *
 * @author xavier
 */
public abstract class RelatorioContasReceber {
    
    
    public void gerarRelatorioTemplateMethod(){
        //pegar dados
        //montar estrutura do relatorio
        this.gerarArquivo();
        //final de código
        
    }
    
    protected abstract void gerarArquivo();
}
