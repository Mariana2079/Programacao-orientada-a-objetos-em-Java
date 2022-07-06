package teste;

import empresa.FuncionarioDepartamento;
import empresa.FuncionarioDepartamentoComissionado;
import empresa.FuncionarioDepartamentoHorista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CadastroFuncionarios {

    public static void main(String[] args) {
        List<FuncionarioDepartamento> lista = new ArrayList();
        
        for(int i = 0; i < 5; i++){
        String nomeFuncionario = JOptionPane.showInputDialog("Informe o nome do funcionario: ");
        String nomeDepartamento = JOptionPane.showInputDialog("Informe o nome do departamento: ");
        String entrada = JOptionPane.showInputDialog("Qual é o tipo de funcionario? " + "\n1 - Comissionado \n2 - Horista");
       
        FuncionarioDepartamento funcionario;
        if(entrada.equals("1")){
            entrada = JOptionPane.showInputDialog("Informe o valor vendido: ");
            double valorVendido = Double.parseDouble(entrada);
            entrada = JOptionPane.showInputDialog("Informe a taxa de comissao: ");
            double taxaComissao= Double.parseDouble(entrada);
            funcionario = new FuncionarioDepartamentoComissionado(valorVendido,taxaComissao,nomeFuncionario,nomeDepartamento);
        }else{
            entrada = JOptionPane.showInputDialog("Informe o valor da hora: ");
            double valorHora = Double.parseDouble(entrada);
            entrada = JOptionPane.showInputDialog("Informe a quantidade de horas: ");
            double quantidadeHoras = Double.parseDouble(entrada);
            funcionario = new FuncionarioDepartamentoHorista(valorHora,quantidadeHoras,nomeFuncionario,nomeDepartamento);
            
        }
        lista.add(funcionario);
       }
        
        String mensagem = "";
        for(int i = 0; i < lista.size(); i++){
           FuncionarioDepartamento funcionario = lista.get(i);
           mensagem += funcionario.toString();
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }

    }

