package professores;

public class Efetivo extends Professor {
    
    private double salarioBase;
    private double adicionalTitulacao;

    public Efetivo() {
        
    }

    public Efetivo(String nome, String email, double salarioBase, double adicionalTitulacao) {
        super(nome, email);
        this.salarioBase = salarioBase;
        this.adicionalTitulacao = adicionalTitulacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAdicionalTitulacao() {
        return adicionalTitulacao;
    }

    public void setAdicionalTitulacao(double adicionalTitulacao) {
        this.adicionalTitulacao = adicionalTitulacao;
    }

    @Override
    public double calculaSalarioTotal() {
        return salarioBase + adicionalTitulacao;
    }
    
}
