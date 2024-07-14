package Aula17.Banco2;

import java.util.Random;
import java.io.Serializable;

public class Conta2  implements Serializable{
    Random ale = new Random();
    private String titular;
    private String id;
    protected float saldo;
    private String senha;
    
    //---------
    
    private void definirId(){
        char cara = titular.charAt(0);
        int nums = ale.nextInt(1000, 10000);
        id = String.format("%c%d", cara, nums);
    }
    public void depositar(float valor){
        saldo += valor;
    }
    public boolean validaAcesso(String senha, String id){
        boolean estado = false;
        if(this.senha.equals(senha) && this.id.equals(id)){
            estado = true;
        }
        return estado;
    }
    
    
    //---------
    
    public Conta2(String titular, String senha, float saldo){
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
        definirId();
    }
    
    public String getTitular(){
        return titular;
    }
    public String getSenha(){
        return senha;
    }
    public void setSanha(String senha){
        this.senha = senha;
    }
    public String getId(){
        return id;
    }
    public float getSaldo(){
        return saldo;
    }
}
