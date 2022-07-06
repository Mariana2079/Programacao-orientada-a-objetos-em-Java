package principal;

import conta.ContaCorrente;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Informe o número da conta");
        long numero = Long.parseLong(entrada);
        entrada = JOptionPane.showInputDialog("Informe o saldo inicial");
        double saldo = Double.parseDouble(entrada);
        
        ContaCorrente conta = new ContaCorrente(numero, saldo);
        
        int operacao = 0;
        while (operacao != 3) {
            entrada = JOptionPane.showInputDialog("Informe a opção desejada\n" + 
                    "[1] Depositar\n" +
                    "[2] Sacar\n" +
                    "[3] Sair");
            operacao = Integer.parseInt(entrada);
            
            switch (operacao) {
                case 1:
                    entrada = JOptionPane.showInputDialog("Valor do depósito");
                    double valorDeposito = Double.parseDouble(entrada);
                    conta.depositar(valorDeposito);
                    System.out.println(conta);
                    break;
                case 2:
                    entrada = JOptionPane.showInputDialog("Valor do saque");
                    double valorSaque = Double.parseDouble(entrada);
                    if (conta.sacar(valorSaque)) {
                        System.out.println(conta);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;                    
            }
        }
    }
    
}
