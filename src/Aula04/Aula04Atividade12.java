package Aula04;

import java.util.Scanner;

public class Aula04Atividade12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num, i, resto=1;
        
        for(num=0;num<=0;){
            System.out.print("Digite um número maior que zero: ");
            num = ler.nextInt();    
        }
        for(i=num-1;i>1 && resto!=0;i--){
            if(i==1)
                i=num;
            resto = num%i;
        }
        if(resto>0)
            System.out.println("\nNúmero é primo!");
        else
            System.out.println("\nO número não é primo!");
    }
}
