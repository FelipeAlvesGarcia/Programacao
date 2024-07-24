package Aula02;

import java.util.Scanner;

public class Aula02Atividade07 {
    public static void main(String[] args){
        float altura, peso, imc;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu peso: ");
        peso = ler.nextFloat();
        System.out.print("Digite sua altura em metros: ");
        altura = ler.nextFloat();
        
        imc = peso/(altura*altura);
        System.out.println("Seu IMC = "+imc);
    }
}
