package Aula03;

import java.util.Scanner;

public class Aula03Atividade05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = ler.nextInt();
        
        if(num >= 10 && num <= 15)
            System.out.println("Seu número está dentre 10 e 15");
        else
            System.out.println("Seu númeronão não está dentre 10 e 15");
    }
}
