package fruta;

public class Fruta {
    
    private String nome;
    private double pesoAproximado;
    private int tamanhoAproximado;
    
    public Fruta() {}
    
    public Fruta(String nome, double pesoAproximado, int tamanhoAproximado) {
        this.nome = nome;
        this.pesoAproximado = pesoAproximado;
        this.tamanhoAproximado = tamanhoAproximado;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPesoAproximado() {
        return pesoAproximado;
    }
    
    public void setPesoAproximado(double pesoAproximado) {
        if (pesoAproximado >= 0) {
            this.pesoAproximado = pesoAproximado;
        } else {
            this.pesoAproximado = 0;
        }
    }
    
    public int getTamanhoAproximado() {
        return tamanhoAproximado;
    }
    
    public void setTamanhoAproximado(int tamanhoAproximado) {
        if (tamanhoAproximado >= 0) {
            this.tamanhoAproximado = tamanhoAproximado;
        } else {
            this.tamanhoAproximado = 0;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + 
                " | Peso aproximado: " + this.pesoAproximado + 
                " | Tamanho aproximado: " + this.tamanhoAproximado;
    }
    
}
