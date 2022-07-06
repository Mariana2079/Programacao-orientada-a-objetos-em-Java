package clientes;

public class Terceiro extends Cliente {
    
    private String cpf;

    public Terceiro() {
    }

    public Terceiro(String nome, String email, int qtdeRefeicoes, String cpf) {
        super(nome, email, qtdeRefeicoes);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calculaValorTotalRefeicoes() {
        return 6.5 * getQtdeRefeicoes();
    }
    
}
