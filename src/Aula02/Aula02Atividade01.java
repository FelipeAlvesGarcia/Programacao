package Aula02;

import java.util.Scanner;

public class Aula02Atividade01 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float numero;
        numero = ler.nextFloat();
        System.out.printf("Seu número: %f\n", numero);
    }
}
