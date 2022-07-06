
package principal;

import javax.swing.JOptionPane;

public class CalculoSalarioLiquido {
    
    public static void main(String[] args) {
        //funcionario nao comissionado
        String entrada = " ";
        entrada = JOptionPane.showInputDialog("Informe o nome do funcionário não comissionado: ");
        String nome = entrada;
        entrada = JOptionPane.showInputDialog("Informe o salário bruto: ");
        double salarioBruto = Double.parseDouble(entrada);
        
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome(nome);       
        funcionario2.setSalarioBruto(salarioBruto);
  
        //funcionario comissionado
        entrada = JOptionPane.showInputDialog("Informe o nome do funcionário comissionado: ");
        nome = entrada;
        entrada = JOptionPane.showInputDialog("Informe o salário bruto: ");
        salarioBruto = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Informe o valor da comissão: ");
        double valorComissao = Double.parseDouble(entrada);
        
        FuncionarioComissionado funcionarioComissao = new FuncionarioComissionado();
        funcionarioComissao.setNome(nome);
        funcionarioComissao.setSalarioBruto(salarioBruto);
        funcionarioComissao.setValorComissao(valorComissao);
      
        String resultado = funcionario2.toString()+ "\nSalário do funcionario comissionado é " + funcionarioComissao.getSalarioLiquido();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
}
