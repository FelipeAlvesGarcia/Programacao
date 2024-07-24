package Aula05;

import java.util.Scanner;

public class Aula05Atividade04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorM = new int[10];
        int x;
        
        System.out.print("Digite um valor para X: ");
        x = ler.nextInt();
        System.out.print("\n");
        for(int i=0;i<vetorA.length;i++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorA[i] = ler.nextInt();
            vetorM[i] = vetorA[i]*x;
        }
        for(int i=0;i<vetorM.length;i++)
            System.out.println(vetorA[i]+" x "+x+" = "+vetorM[i]);
    }
}
