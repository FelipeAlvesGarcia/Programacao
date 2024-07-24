package Aula17.FuncionarioExHeranca;

import java.util.Random;

public class Funcionario {
    Random ale = new Random();
    private String nome;
    private String sobrenome;
    private int matricula;
    
    //--------
    
    void definirMat(){
        matricula = ale.nextInt(1000, 10000);
    }
    
    //------
    
    public Funcionario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        definirMat();
    }
    
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public int getMat(){
        return matricula;
    }
    
}
