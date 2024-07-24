package Aula02;

import java.util.Scanner;

public class Aula02Atividade12 {
    public static void main(String[] args){
        float numero1, numero2, result;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        numero1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        numero2 = ler.nextFloat();
        
        result =(float) Math.pow(numero1, numero2);
        System.out.println("n1^n2 = "+result);
        result = numero1*numero2;
        System.out.println("n1*n2 = "+result);
        
        
    }
}
