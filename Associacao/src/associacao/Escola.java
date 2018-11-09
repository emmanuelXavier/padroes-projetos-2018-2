package associacao;

public class Escola {
    private String CNPJ;
    private String razaoSocial;
    private Departamento departamento = new Departamento();

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public void salvarDepartamento(){
        this.departamento.salvar();
    }
    
    public String getNomeDepartamento(){
        return this.departamento.getNome();
    }

    
    
    
}
