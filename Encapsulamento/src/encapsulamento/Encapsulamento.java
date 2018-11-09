package encapsulamento;

import javax.swing.JOptionPane;


public class Encapsulamento {

    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("EMmanuele");
        pessoa.setSexo('F');
        JOptionPane.showMessageDialog(null, pessoa.getNome());
        
    
    
    }
}
