package main;

import templatemethod.RelatorioContasReceber;
import templatemethod.RelatorioContasReceberPDF;
import templatemethod.RelatorioContasReceberWord;

public class TemplateMethod {

    public static void main(String[] args) {
        RelatorioContasReceber rel = new RelatorioContasReceberWord();
        rel.gerarRelatorioTemplateMethod();
    }
    
}
