package Aula05;

import java.util.Scanner;

public class Aula05Atividade03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] inverso = new int[10];
        int i=0;
        
        for(int n=vetorA.length-1;i<vetorA.length;i++, n--){
            System.out.print("Digite o "+(i+1)+"º númmero: ");
            vetorA[i] = ler.nextInt();
            inverso[n] = vetorA[i];
        }
        for(int n=0;n<inverso.length;n++)
            System.out.print(inverso[n]+" ");
    }
}
