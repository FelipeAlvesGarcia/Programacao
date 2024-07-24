package Aula04;

import java.util.Scanner;

public class Aula04Atividade13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num, i, total;
        
        System.out.print("Digite um número: ");
        num = ler.nextInt();
        total=num;
        
        for(i=1;i<num;i++)
            total+=i;
        
        System.out.println("Total = "+total);
    }
}
