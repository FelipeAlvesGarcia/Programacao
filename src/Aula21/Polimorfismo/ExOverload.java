package Aula21.Polimorfismo;

public class ExOverload {
    //Todos com mesmo nome, mas com parâmetros diferentes
    public int soma (int n1, int n2){
        return n1+n2;
    }
    public int soma (int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public String soma (String n1, String n2){
        return n1+n2;
    }
}
