package Aula01;

import java.util.Scanner;
//import java.util.*  --> todos os pacotes

public class Aula01Exemplo02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número inteiro: ");
        numero = ler.nextInt();
        System.out.println("Seu número: "+numero);
        
        System.out.println("Digite um número real: ");
        float numeroF = ler.nextFloat();
        System.out.println("Seu número: "+numeroF);
        
        
    }
}
