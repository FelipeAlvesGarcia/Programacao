package Aula21.Polimorfismo;

public class ExOverrideAluno extends ExOverride{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //--------
    
    public ExOverrideAluno(String nome, String sobrenome, int idade, int matricula){
        super(nome, sobrenome, idade);
        this.matricula = matricula;
    }
    
    //-------
    
    public String obterDados(){
        String retorno = "Nome: "+getNome()+" "+getSobrenome()+"\nidade: "+getIdade()+"\nmatricula: "+getMatricula();
        return retorno;
    }
    
    public String toString (){ //Modificando um comportamento do metodo do java
        String retorno = "Nome: "+getNome()+" "+getSobrenome()+"\nidade: "+getIdade()+"\nmatricula: "+getMatricula();
        return retorno;
    }
}
