package Aula03;

import java.util.Scanner;

public class Aula03Atividade04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número Inteiro: ");
        num = ler.nextInt();
        int resto = num%2;
        if(resto==0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }
}
