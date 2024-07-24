package Aula24.ExInterface;

public class Ex2Teste {
    public static void main(String[] args){
        Ex2Retangulo r1 = new Ex2Retangulo();
        r1.setBase(7);
        r1.setAltura(3);
        System.out.println("Área = "+r1.area(r1.getBase(), r1.getAltura())+" m²");
        System.out.println("Perimetro = "+r1.perimetro(r1.getBase(), r1.getAltura())+" m");
    }
}
