package clientes;

public abstract class Cliente {
    
    private String nome;
    private String email;
    private int qtdeRefeicoes;

    public Cliente() {
    }

    public Cliente(String nome, String email, int qtdeRefeicoes) {
        this.nome = nome;
        this.email = email;
        this.qtdeRefeicoes = qtdeRefeicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQtdeRefeicoes() {
        return qtdeRefeicoes;
    }

    public void setQtdeRefeicoes(int qtdeRefeicoes) {
        this.qtdeRefeicoes = qtdeRefeicoes;
    }
    
    public abstract double calculaValorTotalRefeicoes();

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nE-mail: " + email +
                "\nValor total das refeições: " + calculaValorTotalRefeicoes();
    }
    
}
