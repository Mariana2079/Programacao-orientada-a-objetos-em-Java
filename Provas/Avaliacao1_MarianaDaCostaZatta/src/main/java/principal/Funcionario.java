package principal;


public class Funcionario {
    
    private String nome;
    double salarioBruto;
    double valorComissao;
    
    public Funcionario() {}
    
    public Funcionario(String nome, double salarioBruto){
        setNome(nome);
        setSalarioBruto(salarioBruto);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioBruto * 0.8;
    }

    @Override
    public String toString() {
        return "O salário líquido do funcionário " + nome + " é: " + getSalarioLiquido();
    }
       
    
}
