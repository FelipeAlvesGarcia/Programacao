package Aula03;

import java.util.Scanner;

public class Aula03Atividade19 {
    public static void main(String[] args){
        int opcao;
        float Pi = (float)Math.PI;
        Scanner ler = new Scanner(System.in);
        float altura, base, lado, raio, area;
        
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Círculo");
        System.out.println("4 - Retângulo");
        
        System.out.print("\nCalcular a área de qual figura geométrica: ");
        opcao = ler.nextInt();
        
        switch (opcao){
            case 1 ->{
                System.out.print("Digite o lado do quadrado: ");
                lado = ler.nextFloat();
                area = lado*lado;
                System.out.println("\nÁrea do quadrado = "+area+"uc");
            }
            case 2 ->{
                System.out.print("Digite a base do triângulo: ");
                base = ler.nextFloat();
                System.out.print("Digite a altura do triângulo: ");
                altura = ler.nextFloat();
                area = base*altura/2;
                System.out.println("\nÁrea do triângulo = "+area+"uc");
            }
            case 3 ->{
                System.out.print("Digite o raio do Círculo: ");
                raio = ler.nextFloat();
                area = raio*raio*Pi;
                System.out.println("\nÁrea do círculo = "+area+"uc");
            }
            case 4 ->{
                System.out.print("Digite a base do Retângulo: ");
                base = ler.nextFloat();
                System.out.print("Digite a altura do Retângulo: ");
                altura = ler.nextFloat();
                area = base*altura;
                System.out.println("\nÁrea do retângulo = "+area+"uc");
            }
            default->System.out.println("\nFigura Inválida!");
        }
    }
}