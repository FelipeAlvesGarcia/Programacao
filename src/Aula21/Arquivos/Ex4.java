package Aula21.Arquivos;

import java.io.Serializable;

public class Ex4 implements Serializable{
    private String nome;
    private String sobrenome;
    private int cpf;

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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    //-----
    
    public String toString (){
        return "Nome: "+nome+" "+sobrenome+"\nCPF: "+cpf;
    }
}
