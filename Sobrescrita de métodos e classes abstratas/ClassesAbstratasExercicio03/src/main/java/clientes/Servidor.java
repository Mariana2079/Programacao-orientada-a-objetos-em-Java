package clientes;

public class Servidor extends Cliente {
    
    private String siape;

    public Servidor() {
    }

    public Servidor(String nome, String email, int qtdeRefeicoes, String siape) {
        super(nome, email, qtdeRefeicoes);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public double calculaValorTotalRefeicoes() {
        return 6.5 * 0.92 * getQtdeRefeicoes();
    }
    
}
