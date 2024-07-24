package Aula22.ExAbstract;

public abstract class Ex1 {
    private String figuras;

    public String getFiguras() {
        return figuras;
    }

    public void setFiguras(String figuras) {
        this.figuras = figuras;
    }
    
    //
    
    public abstract double calcArea();
    public abstract double calcPerimetro();
}
