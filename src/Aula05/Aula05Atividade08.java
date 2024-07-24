package Aula05;

import java.util.Scanner;

public class Aula05Atividade08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetorX = new int[10], vetorR = new int[10];
        int i, n;
        
        for(i=0, n=0;i<vetorX.length;i++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorX[i] = ler.nextInt();
            if(vetorX[i]<0){
                vetorR[n] = vetorX[i];
                n++;
            }
        }
        System.out.println("\n\nTodos os números: ");
        for(int valor:vetorX)
            System.out.print(valor+" ");
        System.out.println("\nTodos os números negativos: ");
        for(i=0; i<n; i++)
            System.out.print(vetorR[i]+" ");
        
    }
}
