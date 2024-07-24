package Aula04;

import java.util.Scanner;

public class Aula04Atividade02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, cont=0;
        float num;
        
        for(i=1; i<=10; i++){
            System.out.print("Digite o "+i+"º número: ");
            num = ler.nextFloat();
            if(num<20 && num>10){
                cont++;
            }
        }
        System.out.println("\nNúmero de números entre 10 e 20: "+cont);
    }
}