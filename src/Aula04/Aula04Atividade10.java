package Aula04;

import java.util.Scanner;

public class Aula04Atividade10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float n;
        
        for(n=0;n<=0;){
            System.out.print("Digite um número maior que ZERO: ");
            n = ler.nextFloat();
        }
        System.out.print("\n");
        for(int i = 1; i<n;i++)
            System.out.print(i+" ");
        System.out.print("\n");
    }
}
