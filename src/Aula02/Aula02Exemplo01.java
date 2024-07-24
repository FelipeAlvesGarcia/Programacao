package Aula02;

import java.util.Scanner;

public class Aula02Exemplo01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Número Intero: ");
        numero = ler.nextInt();
        System.out.println("\nO número "+numero);
        System.out.print("Número Real: ");
        float numeroReal;
        numeroReal = ler.nextFloat();
        System.out.printf("O número real %f\n",numeroReal);
        
        float valorPi = (float)Math.PI;
        int base = 2;
        int expoente = 2;
        double resultado = Math.pow(base,expoente);
        System.out.println(resultado);
        
        
        char letra;
        System.out.print("Digite uma letra: ");
        letra = ler.next().charAt(0);
        System.out.println("Sua Letra - "+letra);
    }
}
