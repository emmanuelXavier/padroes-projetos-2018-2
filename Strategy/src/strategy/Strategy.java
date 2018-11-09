package strategy;

import javax.swing.JOptionPane;


public class Strategy {

    public static void main(String[] args) {
        while (true){
            String strategy = JOptionPane.showInputDialog("Informe a classe");
            Conector conector = new Conector(strategy);
            conector.conectarBanco();
        }
    }
    
}
