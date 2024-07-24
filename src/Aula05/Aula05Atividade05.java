package Aula05;

import java.util.Scanner;
import java.util.Random;

public class Aula05Atividade05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int[] vetor = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int i, n, m;
        
        for(i=0, n=0, m=0;i<vetor.length;i++)
            vetor[i] = random.nextInt(1, 101);
        for(i=0; i<vetor.length;i++){
            int resto = vetor[i]%2;
            if(resto==1){
                impar[n] = vetor[i];
                n++;
            }
            else{
                par[m] = vetor[i];
                m++;
            }
        }
        System.out.println("\nNúmeros pares: ");
        for(int j=0;j<m;j++)
            System.out.print(par[j]+" ");
        System.out.println("\n\nNúmeros impares: ");
        for(int j=0;j<n;j++)
            System.out.print(impar[j]+" ");
    }
}