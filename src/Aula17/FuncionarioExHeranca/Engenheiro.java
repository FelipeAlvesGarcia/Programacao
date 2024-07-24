package Aula17.FuncionarioExHeranca;

public class Engenheiro extends Funcionario{
    private int crea;
    
    public Engenheiro(String nome, String sobrenome, int crea){
        super(nome, sobrenome);
        this.crea = crea;
        definirMat();
    }
    
    public int getCrea (){
        return crea;
    }
    public void setCrea (int crea){
        this.crea = crea;
    }
}
