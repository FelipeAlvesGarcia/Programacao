package Aula04;

import java.util.Scanner;

public class Aula04Atividade08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int cont=0;
        float num, total=0;
        
        do{
            System.out.print("Digite um número positivo: ");
            num = ler.nextFloat();
            if(num>0){
               cont++; 
               total += num;
            } 
        }
        while(num!=-1);
        System.out.println("\nQuantidade de números positivos digitados: "+cont);
        System.out.println("Soma de todos os números positivos: "+total);
    }
}