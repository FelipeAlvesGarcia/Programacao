package Aula17.Banco2;

public class CP extends Conta2{
    public boolean sacar(float valor){
        boolean status = false;
        if(valor <= saldo){
            saldo -= valor;
            status = true;
        }
        return status;
    }
    
    public CP(String nome, String senha, float saldo){
        super(nome, senha, saldo);
    }
}
