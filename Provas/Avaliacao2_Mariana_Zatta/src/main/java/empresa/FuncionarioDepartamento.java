package empresa;

    public abstract class FuncionarioDepartamento implements Funcionario{
    
        private String nomeFuncionario;
        private String nomeDepartamento;

        
    public FuncionarioDepartamento(){
    }
   
    public FuncionarioDepartamento(String nomeFuncionario, String nomeDepartamento) {
        this.nomeFuncionario = nomeFuncionario;
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    @Override
    public String toString() {
        return "Nome: " + nomeFuncionario + "| Departamento: " + nomeDepartamento + "| Remuneração: " + calcularRemuneracao() + "\n\n";
    }
    
    
   
    
    
    
        
    }
    



