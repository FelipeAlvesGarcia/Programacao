package Aula03;

import java.util.Scanner;

public class Aula03Atividade09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float lado1, lado2, lado3, menor = 0, maior=0, medio=0;
        
        System.out.print("Digite o 1°lado: ");
        lado1 = ler.nextFloat();
        System.out.print("Digite o 2°lado: ");
        lado2 = ler.nextFloat();
        System.out.print("Digite o 3°lado: ");
        lado3 = ler.nextFloat();
        
        if(lado1<=0 || lado2<=0 || lado3<=0)
            System.out.println("Isto não é um triângulo!");
        else if((lado1+lado2+lado3)/3 == lado1)
            System.out.println("\nTriângulo EQUILÁTERO");
        else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
            System.out.println("\nTriângulo ISÓSCELES");
        else{ 
            if(lado1 < lado2 && lado1 < lado3){
                menor = lado1;
                if (lado2 < lado3){
                    medio = lado2;
                    maior = lado3;
                }
                else{
                    medio = lado3;
                    maior = lado2;
                }
            } 
            else if(lado2 < lado3 && lado2 < lado1){
                menor = lado2;
                if (lado1 < lado3){
                    medio = lado1;
                    maior = lado3;
                }
                else{
                    medio = lado3;
                    maior = lado1;
                }
            } 
            else if(lado3 < lado1 && lado3 < lado2){
                menor = lado3;
                if (lado1 < lado2){
                    medio = lado1;
                    maior = lado2;
                }
                else{
                    medio = lado2;
                    maior = lado1;
                }
            } 
            if((menor+medio)>maior)
                System.out.println("\nIsto não é um triângulo");
            else
                System.out.println("\nTriângulo ESCALENO");
        }
    }
}