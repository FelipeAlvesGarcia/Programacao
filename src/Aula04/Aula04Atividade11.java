package Aula04;

import java.util.Scanner;

public class Aula04Atividade11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float num;
        
        System.out.print("Digite um número: ");
        num = ler.nextFloat();
        
        for(int i=1;i<=10;i++)
            System.out.printf("\n%2d x %.2f = %.3f", i, num, (i*num));
        System.out.print("\n\n");
    }
}
