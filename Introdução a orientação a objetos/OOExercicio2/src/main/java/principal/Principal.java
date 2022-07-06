package principal;

import imc.Imc;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Informe seu peso (kg)");
        double peso = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Informe sua altura (m)");
        double altura = Double.parseDouble(entrada);
        
        Imc imc = new Imc();
        imc.setPeso(peso);
        imc.setAltura(altura);
        
        System.out.println(imc);
        
        if (imc.dadosValidos()) {
            double valorImc = imc.calcularImc();
            String resultado = imc.interpretarImc(valorImc);
            System.out.println("Resultado do cálculo do IMC: " + resultado);
        } else {
            System.out.println("Informe valores maiores do que zero");
        }
    }
    
}
