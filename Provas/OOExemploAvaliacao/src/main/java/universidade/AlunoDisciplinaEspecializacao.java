package universidade;

public class AlunoDisciplinaEspecializacao extends AlunoDisciplina {
    
    public AlunoDisciplinaEspecializacao() {}
    
    public AlunoDisciplinaEspecializacao(String nomeAluno, String nomeDisciplina,
            double nota1, double nota2) {
        setNomeAluno(nomeAluno);
        setNomeDisciplina(nomeDisciplina);
        setNota1(nota1);
        setNota2(nota2);
    }

    @Override
    public String getSituacao() {
        if (getMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
}
