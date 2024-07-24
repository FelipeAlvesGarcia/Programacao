package Aula04;

import java.util.Scanner;

public class Aula04Atividade14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num, i, total;
        
        for(num=0;num<=0;){
            System.out.print("Digite um número maior que zero: ");
            num = ler.nextInt();
        }
        total=num;
        
        for(i=1;i<num;i++)
            total+=i;
        
        System.out.println("Total = "+total);
    }
}
