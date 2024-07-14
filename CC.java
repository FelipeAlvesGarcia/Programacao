package Aula17.Banco2;

public class CC extends Conta2{
    private float limite;
    
    //
    
    public boolean sacar(float valor){
        boolean status = false;
        if(valor <= saldo+limite){
            saldo -= valor;
            status = true;
        }
        return status;
    }
    
    //
    
    public CC(String nome, String senha, float saldo, float limite){
        super(nome, senha, saldo);
        this.limite = limite;
    }
    
    public float getLimite(){
        float statusLimite = limite;
        if(saldo<0){
            statusLimite += saldo;
        }
        return statusLimite;
    }
}
