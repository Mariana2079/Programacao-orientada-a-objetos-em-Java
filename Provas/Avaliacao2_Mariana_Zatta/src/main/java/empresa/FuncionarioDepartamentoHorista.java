package empresa;

public class FuncionarioDepartamentoHorista extends FuncionarioDepartamento {
       
    private double valorHora;
    private double quantidadeHoras;

    public FuncionarioDepartamentoHorista() {
    }

    public FuncionarioDepartamentoHorista(double valorHora, double quantidadeHoras, String nomeFuncionario, String nomeDepartamento) {
        super(nomeFuncionario, nomeDepartamento);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    
    @Override
    public double calcularRemuneracao(){
        return valorHora * quantidadeHoras;
    }
    
    
}
