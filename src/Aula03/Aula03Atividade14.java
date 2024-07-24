package Aula03;

import java.util.Scanner;

public class Aula03Atividade14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float horas, salario, salarioTotal;
        
        System.out.print("Número de horas trabalhas no mês: ");
        horas = ler.nextFloat();
        System.out.print("Salário por hora: ");
        salario = ler.nextFloat();
        
        if(horas>40)
            salarioTotal = (float)((horas-40)*salario*1.5)+(40*salario);
        else
            salarioTotal = horas * salario;
        System.out.println("\nSeu salário será = R$"+salarioTotal);
    }
}
