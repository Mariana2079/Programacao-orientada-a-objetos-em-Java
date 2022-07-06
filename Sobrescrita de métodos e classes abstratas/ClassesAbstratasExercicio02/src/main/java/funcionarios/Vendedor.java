package funcionarios;

public class Vendedor extends Funcionario {
    
    private double totalVendido;

    public Vendedor() {
    }

    public Vendedor(String nome, String rg, double totalVendido) {
        super(nome, rg);
        this.totalVendido = totalVendido;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    @Override
    public double calculaSalarioTotal() {
        // 5% de comissão
        return totalVendido * 0.05;
    }
    
}
