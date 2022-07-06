package principal;

import funcionarios.Administrativo;
import funcionarios.Vendedor;
import javax.swing.JOptionPane;

public class TestandoFuncionarios {
    
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 3) {
            String menu = "Selecione uma das opções" +
                    "\n1 - Vendedor" +
                    "\n2 - Funcionário Administrativo" +
                    "\n3 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcao == 1 || opcao == 2) {
                String nome = JOptionPane.showInputDialog("Informe o nome");
                String rg = JOptionPane.showInputDialog("Informe o RG");
                if (opcao == 1) {
                    String entrada = JOptionPane.showInputDialog("Informe o valor total vendido");
                    double valorTotalVendido = Double.parseDouble(entrada);
                    Vendedor vendedor = new Vendedor(nome, rg, valorTotalVendido);
                    JOptionPane.showMessageDialog(null, vendedor);
                } else {
                    String entrada = JOptionPane.showInputDialog("Informe o salário base");
                    double salarioBase = Double.parseDouble(entrada);
                    entrada = JOptionPane.showInputDialog("Informe a quantidade de horas extras");
                    int qtdeHorasExtras = Integer.parseInt(entrada);
                    Administrativo administrativo = new Administrativo(nome, rg, salarioBase, qtdeHorasExtras);
                    JOptionPane.showMessageDialog(null, administrativo);
                }                
            }
        }
    }
    
}
