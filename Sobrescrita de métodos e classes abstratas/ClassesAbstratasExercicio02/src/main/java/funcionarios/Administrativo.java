package funcionarios;

public class Administrativo extends Funcionario {
    
    private double salarioBase;
    private int qtdeHorasExtras;

    public Administrativo() {
    }

    public Administrativo(String nome, String rg, double salarioBase, int qtdeHorasExtras) {
        super(nome, rg);
        this.salarioBase = salarioBase;
        this.qtdeHorasExtras = qtdeHorasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getQtdeHorasExtras() {
        return qtdeHorasExtras;
    }

    public void setQtdeHorasExtras(int qtdeHorasExtras) {
        this.qtdeHorasExtras = qtdeHorasExtras;
    }

    @Override
    public double calculaSalarioTotal() {
        return salarioBase + (salarioBase / 100 * qtdeHorasExtras);
    }
    
}
