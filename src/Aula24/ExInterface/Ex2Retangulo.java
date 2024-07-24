package Aula24.ExInterface;

public class Ex2Retangulo implements Ex2{
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
    
    @Override
    public double area(double base, double altura){
        return base*altura;
    }
    
    @Override
    public double perimetro(double base, double altura){
        return (2*base)+(2*altura);
    }
}
