package Aula07;

import java.util.Scanner;

public class Aula07PreAtividade {

    public static int soma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho;
        System.out.print("Digite o tamanho do vetor: ");
        tamanho = ler.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = ler.nextInt();
        }
        int total = soma(vetor);
        System.out.println("\nSoma do vetor = "+total);
    }
}