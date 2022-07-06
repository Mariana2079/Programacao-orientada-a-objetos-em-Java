package principal;

import javax.swing.JOptionPane;
import universidade.AlunoDisciplinaEspecializacao;
import universidade.AlunoDisciplinaGraduacao;

public class CadastroAlunosUniversidade {
    
    public static void main(String[] args) {
        // Aluno de graduação
        String entrada = "";
        entrada = JOptionPane.showInputDialog("Informe o nome do aluno de graduação");
        String nomeAluno = entrada;
        entrada = JOptionPane.showInputDialog("Informe o nome da disciplina");
        String nomeDisciplina = entrada;
        entrada = JOptionPane.showInputDialog("Informe a primeira nota");
        double nota1 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Informe a segunda nota");
        double nota2 = Double.parseDouble(entrada);
        
        AlunoDisciplinaGraduacao alunoGraduacao = new AlunoDisciplinaGraduacao();
        alunoGraduacao.setNomeAluno(nomeAluno);
        alunoGraduacao.setNomeDisciplina(nomeDisciplina);
        alunoGraduacao.setNota1(nota1);
        alunoGraduacao.setNota2(nota2);
        
        // Aluno de especialização
        entrada = JOptionPane.showInputDialog("Informe o nome do aluno de especialização");
        nomeAluno = entrada;
        entrada = JOptionPane.showInputDialog("Informe o nome da disciplina");
        nomeDisciplina = entrada;
        entrada = JOptionPane.showInputDialog("Informe a primeira nota");
        nota1 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Informe a segunda nota");
        nota2 = Double.parseDouble(entrada);
        
        AlunoDisciplinaEspecializacao alunoEspecializacao = new AlunoDisciplinaEspecializacao();
        alunoEspecializacao.setNomeAluno(nomeAluno);
        alunoEspecializacao.setNomeDisciplina(nomeDisciplina);
        alunoEspecializacao.setNota1(nota1);
        alunoEspecializacao.setNota2(nota2);
        
        String resultado = "Aluno Graduação\n" + alunoGraduacao.gerarConteudoCarta() +
                "\n\nAluno Especialização\n" + alunoEspecializacao.gerarConteudoCarta();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
