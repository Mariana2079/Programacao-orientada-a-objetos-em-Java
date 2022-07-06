package universidade;

public class AlunoDisciplinaGraduacao extends AlunoDisciplina {
    
    public AlunoDisciplinaGraduacao() {}
    
    public AlunoDisciplinaGraduacao(String nomeAluno, String nomeDisciplina, 
            double nota1, double nota2) {
        setNomeAluno(nomeAluno);
        setNomeDisciplina(nomeDisciplina);
        setNota1(nota1);
        setNota2(nota2);
    }

    @Override
    public String getSituacao() {
        double media = getMedia();
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
    
}
