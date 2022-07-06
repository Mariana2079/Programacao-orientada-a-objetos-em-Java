package principal;

import javax.swing.JOptionPane;
import operacoes.Operacoes;

public class Principal {
    
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Informe o primeiro valor");
        double valor1 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Informe o segundo valor");
        double valor2 = Double.parseDouble(entrada);
        
        Operacoes operacoes = new Operacoes(valor1, valor2);
        
        System.out.println(operacoes);
        System.out.println("Soma: " + operacoes.somar());
        System.out.println("Subtração: " + operacoes.subtrair());
        System.out.println("Multiplicação: " + operacoes.multiplicar());
        System.out.println("Divisão: " + operacoes.dividir());
    }
    
}
