package Aula04;

import java.util.Scanner;

public class Aula04Atividade03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float num;
        
        do{
            System.out.print("Digite um número entre 10 e 1: ");
            num = ler.nextFloat();
        }
        while(num>10 || num<1);
        System.out.println("\nSeu número: "+num);
    }
}
