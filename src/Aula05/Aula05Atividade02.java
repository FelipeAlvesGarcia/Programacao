package Aula05;

import java.util.Scanner;

public class Aula05Atividade02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[100];
        int i=0;
        
        do{
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetor[i] = ler.nextInt();
            i++;
        }while(i<vetor.length && vetor[i-1]>0);
        
        for(int n=0; n<i-1; n++)
            System.out.print(vetor[n]+" ");
    }
}
