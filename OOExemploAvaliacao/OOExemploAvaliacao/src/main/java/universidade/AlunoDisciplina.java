package universidade;

public class AlunoDisciplina {
    
    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getMedia() {
        return (nota1 + nota2) / 2;
    }
    
    public String getSituacao() {
        return "Não informado";
    }
    
    public String gerarConteudoCarta() {
        return "Prezado aluno " + nomeAluno + "\n\n" +
                "Informamos que sua média na disciplina " + nomeDisciplina +
                " é " + getMedia() + " e sua situação é " + getSituacao() + 
                "\n\nAtenciosamente";
    }
    
}
