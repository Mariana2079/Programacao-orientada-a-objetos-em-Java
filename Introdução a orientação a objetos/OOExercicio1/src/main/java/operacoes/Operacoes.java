package operacoes;

public class Operacoes {
    
    private double valor1;
    private double valor2;
    
    public Operacoes() {
        
    }
    
    public Operacoes(double v1, double v2) {
        valor1 = v1;
        valor2 = v2;
    }
    
    public double getValor1() {
        return valor1;
    }
    
    public void setValor1(double v1) {
        valor1 = v1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double v2) {
        valor2 = v2;
    }

    public String toString() {
        return "Valor 1: " + valor1 + " | Valor 2: " + valor2;
    }
    
    public double somar() {
        return valor1 + valor2;
    }
    
    public double subtrair() {
        return valor1 - valor2;
    }
    
    public double multiplicar() {
        return valor1 * valor2;
    }
    
    public double dividir() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            return 0;
        }
    }
    
}
