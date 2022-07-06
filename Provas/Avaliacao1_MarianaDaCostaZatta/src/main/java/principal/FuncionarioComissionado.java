
package principal;

public class FuncionarioComissionado extends Funcionario {
    
    private double valorComissao;
    
        
    public double getValorComissao() {
        return valorComissao;
    }
    
    public void setValorComissao(double valorComissao) {
        this.valorComissao  = valorComissao;
    }
     
    public FuncionarioComissionado() {}
    
    public FuncionarioComissionado(String nome,double salarioBruto, double valorComissao) {
        setNome(nome);
        setSalarioBruto(salarioBruto);
        setValorComissao(valorComissao);
    }
    
    @Override
    public double getSalarioLiquido() {
        return salarioBruto * 0.8 + valorComissao;

    }
    
}
