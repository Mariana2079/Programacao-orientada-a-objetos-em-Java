package principal;

import clientes.Academico;
import clientes.Servidor;
import clientes.Terceiro;
import javax.swing.JOptionPane;

public class TestandoClientes {
    
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 4) {
            String menu = "Selecione uma das opções" +
                    "\n1 - Acadêmico" +
                    "\n2 - Servidor" +
                    "\n3 - Terceiro" +
                    "\n4 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcao == 1 || opcao == 2 || opcao == 3) {
                String nome = JOptionPane.showInputDialog("Informe o nome");
                String email = JOptionPane.showInputDialog("Informe o e-mail");
                String entrada = JOptionPane.showInputDialog("Informe a quantidade de refeições");
                int qtdeRefeicoes = Integer.parseInt(entrada);
                if (opcao == 1) {
                    String ra = JOptionPane.showInputDialog("Informe o RA");
                    Academico academico = new Academico(nome, email, qtdeRefeicoes, ra);
                    JOptionPane.showMessageDialog(null, academico);
                } else if (opcao == 2) {
                    String siape = JOptionPane.showInputDialog("Informe o SIAPE");
                    Servidor servidor = new Servidor(nome, email, qtdeRefeicoes, siape);
                    JOptionPane.showMessageDialog(null, servidor);
                } else {
                    String cpf = JOptionPane.showInputDialog("Informe o CPF");
                    Terceiro terceiro = new Terceiro(nome, email, qtdeRefeicoes, cpf);
                    JOptionPane.showMessageDialog(null, terceiro);
                }
            }
        }
    }
    
}
