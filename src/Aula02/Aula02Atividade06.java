package Aula02;

import java.util.Scanner;

public class Aula02Atividade06 {
    public static void main(String[] args){
        float horas, porHora, total;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite quanto você ganha por hora: ");
        porHora = ler.nextFloat();
        System.out.print("Digite quantas você trabalha por mês: ");
        horas = ler.nextFloat();
        
        total = horas*porHora;
        System.out.println("\nSalário por mês = R$"+total);
        
    }
}
