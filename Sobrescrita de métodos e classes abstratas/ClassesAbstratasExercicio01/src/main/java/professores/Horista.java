package professores;

public class Horista extends Professor {
    
    private int qtdeHoras;
    private double valorHora;

    public Horista() {}

    public Horista(String nome, String email, int qtdeHoras, double valorHora) {
        super(nome, email);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        if (qtdeHoras > 0) {
            this.qtdeHoras = qtdeHoras;
        } else {
            this.qtdeHoras = 0;
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            this.valorHora = 0;
        }        
    }
    
    @Override
    public double calculaSalarioTotal() {
        return qtdeHoras * valorHora;
    }
    
}
