package Aula22.ExAbstract;

public class RetanguloEx1 extends Ex1{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // ----------
    
    //Obrigado a declarar ou tornar a classe abstract
    @Override
    public double calcArea(){
        return base*altura;
    }
    
    @Override
    public double calcPerimetro(){
        return (2*base)+(2*altura);
    }
}