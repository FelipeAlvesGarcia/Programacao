package Aula05;

import java.util.Scanner;

public class Aula05Atividade01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual é o tamanho dos vetores? -> ");
        int tamanho = ler.nextInt();
        
        int[] vetorA = new int[tamanho]; 
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];
        
        for(int i=0; i<vetorA.length; i++){
            System.out.print("Digite o "+(i+1)+"º número do Vetor A: ");
            vetorA[i] = ler.nextInt();
        }
        System.out.print("\n");
        for(int i=0; i<vetorB.length; i++){
            System.out.print("Digite o "+(i+1)+"º número do Vetor B: ");
            vetorB[i] = ler.nextInt();
        }
        for(int i=0; i<vetorC.length; i++)
            vetorC[i] = vetorA[i] + vetorB[i];
        System.out.print("\n");
        for(int valor:vetorC)
            System.out.print(valor+" ");
    }
}