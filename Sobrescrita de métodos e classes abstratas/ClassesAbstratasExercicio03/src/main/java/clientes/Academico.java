package clientes;

public class Academico extends Cliente {
    
    private String ra;

    public Academico() {
    }

    public Academico(String nome, String email, int qtdeRefeicoes, String ra) {
        super(nome, email, qtdeRefeicoes);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public double calculaValorTotalRefeicoes() {
        return 6.5 * 0.9 * getQtdeRefeicoes();
    }
    
}
