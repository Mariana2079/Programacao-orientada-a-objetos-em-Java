package funcionarios;

public abstract class Funcionario {
    
    private String nome;
    private String rg;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public abstract double calculaSalarioTotal();

    @Override
    public String toString() {
        return "Nome: " + nome + 
                "\nRG: " + rg +
                "\nSalário total: " + calculaSalarioTotal();
    }
    
}
