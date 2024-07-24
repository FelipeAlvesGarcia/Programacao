package Aula21.Final;

public class ExemploFinal {
    //Atributo final, não precisa ser inicializada na inicialização (ganha valor no construtor)
    public final double PI;
    public ExemploFinal(){
        PI = 3.141592;
    }
    
    //Contante, precisa ser inicializado e static
    public static final double PI2 = 3.141592;
}
