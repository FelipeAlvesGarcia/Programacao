package Aula03;

import java.util.Scanner;

public class Aula03Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float numero1, numero2;
        
        System.out.print("Digite um número: ");
        numero1 = ler.nextFloat();
        System.out.print("Digite outro número: ");
        numero2 = ler.nextFloat();
        
        if(numero1 > numero2)
            System.out.println("\n"+numero1+" é o maior!");
        else if(numero1 == numero2)
            System.out.println("\n Os números são iguais!");
        else
            System.out.println("\n"+numero2+" é o maior!");
    }
}
