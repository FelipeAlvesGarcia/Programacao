package Aula02;

import java.util.Scanner;

public class Aula02Atividade10 {
    public static void main(String[] args){
        float lado, perimetro, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o lado: ");
        lado = ler.nextFloat();
        
        perimetro = lado*4;
        area = lado*lado;
        System.out.println("\nPerímetro: "+perimetro+"uc");
        System.out.println("Área = "+area);
    }
}
