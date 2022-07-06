package empresa;

public class FuncionarioDepartamentoComissionado extends FuncionarioDepartamento {

    private double valorVendido;
    private double taxaComissao;

    public FuncionarioDepartamentoComissionado() {
    }

    public FuncionarioDepartamentoComissionado(double valorVendido, double taxaComissao, String nomeFuncionario, String nomeDepartamento) {
        super(nomeFuncionario, nomeDepartamento);
        this.valorVendido = valorVendido;
        this.taxaComissao = taxaComissao;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public double calcularRemuneracao(){
        return valorVendido * (taxaComissao / 100);    
    }
    
    
    

   
}
