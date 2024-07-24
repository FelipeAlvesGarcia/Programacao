package Aula02;

import java.util.Scanner;

public class Aula02Atividade09 {
    public static void main(String [] args){
        float numero1, numero2, soma, produto;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        numero1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        numero2 = ler.nextFloat();
        
        soma = numero1 + numero2;
        produto = numero1 * numero2;
        System.out.println("\nSoma = "+soma);
        System.out.println("Produto = "+produto);
    }
}
