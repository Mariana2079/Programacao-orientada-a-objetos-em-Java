package imc;

public class Imc {
    
    private double peso;
    private double altura;
    
    public Imc() {
        
    }
    
    public Imc(double p, double a) {
        peso = p;
        altura = a;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double p) {
        peso = p;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double a) {
        altura = a;
    }
    
    public String toString() {
        return "Peso: " + peso + " | Altura: " + altura;
    }
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
    
    public String interpretarImc(double imc) {
        if (imc < 20) {
            return "Magreza";
        } else if (imc <= 24) {
            return "Normal";
        } else if (imc <= 29) {
            return "Sobrepeso";
        } else if (imc <= 34) {
            return "Obesidade";
        } else {
            return "Obesidade mórbida";
        }
    }
    
    public boolean dadosValidos() {
        return peso > 0 && altura > 0;
    }
    
}
