package Aula21.Polimorfismo;

public class ExOverride {
    private String nome;
    private String sobrenome;
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //----------
    
    public ExOverride (String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    
    //----------
    
    public String obterDados (){
        String retorno = "Nome: "+getNome()+" "+getSobrenome()+"\nIdade = "+getIdade();
        return retorno;
    }
}
