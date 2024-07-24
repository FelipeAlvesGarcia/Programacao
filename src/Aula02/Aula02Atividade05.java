package Aula02;

import java.util.Scanner;

public class Aula02Atividade05 {
    public static void main(String[] args){
        float valorPi = (float) Math.PI;
        float raio, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        raio = ler.nextFloat();
        area = raio*raio*valorPi;
        
        System.out.println("\nÁrea do Círculo = "+area+"uc");
    }
}
