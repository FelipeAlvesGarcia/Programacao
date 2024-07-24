package Aula17.FuncionarioExHeranca;

public class Motorista extends Funcionario{
    private int cnh;
    
    public Motorista(String nome, String sobrenome){
        super(nome, sobrenome);
        definirMat();
    }
    
    public int getCnh (){
        return cnh;
    }
    public void setCnh (int cnh){
        this.cnh = cnh;
    }
}
