package Aula21.Final;

public final class PessoaFinal {
    private String nome;
    private String sobrenome;
    private float altura;
    
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public float getAltura(){
        return altura;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
}
