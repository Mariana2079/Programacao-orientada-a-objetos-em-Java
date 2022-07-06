package principal;

import javax.swing.JOptionPane;
import professores.Efetivo;
import professores.Horista;

public class TestandoProfessores {
    
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 3) {
            String menu = "Selecione uma das opções" +
                    "\n1 - Professor Efetivo" +
                    "\n2 - Professor Horista" +
                    "\n3 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcao == 1 || opcao == 2) {
                String nome = JOptionPane.showInputDialog("Informe o nome");
                String email = JOptionPane.showInputDialog("Informe o e-mail");
                if (opcao == 1) {
                    String entrada = JOptionPane.showInputDialog("Informe o salário base");
                    double salarioBase = Double.parseDouble(entrada);
                    entrada = JOptionPane.showInputDialog("Informe o adicional por titulação");
                    double adicionalTitulacao = Double.parseDouble(entrada);
                    Efetivo efetivo = new Efetivo(nome, email, salarioBase, adicionalTitulacao);
                    JOptionPane.showMessageDialog(null, efetivo);
                } else {
                    String entrada = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas");
                    int qtdeHoras = Integer.parseInt(entrada);
                    entrada = JOptionPane.showInputDialog("Informe o valor da hora trabalhada");
                    double valorHora = Double.parseDouble(entrada);
                    Horista horista = new Horista(nome, email, qtdeHoras, valorHora);
                    JOptionPane.showMessageDialog(null, horista);
                }                
            }
        }
    }
    
}
