package Aula21.Excecoes;

public class ExExcecao3 {
    public int soma(int n1, int n2) throws ArithmeticException{
        if(n2 == 0){
            throw new ArithmeticException("erro"); 
        }
        return n1/n2;
    }
}