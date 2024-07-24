package Aula02;

import java.util.Scanner;

public class Aula02Atividade11 {
    public static void main(String[] args){
        float altura, base, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a base do triângulo: ");
        base = ler.nextFloat();
        System.out.print("Digite a ltura do triângulo: ");
        altura = ler.nextFloat();
        
        area = base*altura/2;
        System.out.println("\nÁrea = "+area);
    }
}
