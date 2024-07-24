package Aula13.Banco;

import java.util.Random;

public class Conta {
    Random ale = new Random();
    private String titular;
    private int id;
    private float saldo;
    private String senha;
    
    //-------------
    
    void depositar (float valor){
        saldo += valor;
        System.out.println("Depositado com sucesso!");
    }
    boolean sacar (float valor){
        boolean saque = false;
        if(valor<=saldo){
            saque = true;
            saldo -= valor;
        }
        return saque;
    }
    
    private void definirId (){
        id = ale.nextInt(1000, 10000);
    }
    
    //--------------
    
    public Conta(String titular, String senha, int saldo){
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
        definirId();
    }
    
    public int getId(){
        return id;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public float getSaldo(){
        return saldo;
    }
}
