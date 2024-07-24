package Aula07;

import java.util.Scanner;
import java.util.Random;

public class Aula07Atividade05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        char opcao;
        float temp, tempFinal;
        do{
            System.out.println("(f) - Converter de Celsus para Farenheit");
            System.out.println("(c) - Converter Farenheit para Celsus");
            System.out.print("\nDigite a opção desejada: ");
            opcao = ler.next().toLowerCase().charAt(0);
            switch(opcao){
                case 'f'->{
                    System.out.print("Digite a temperatura: ");
                    temp = ler.nextFloat();
                    
                    tempFinal =  (float)(9*temp/5) + 32;
                    System.out.println("\nSua temperatura em Farenheit = "+tempFinal);
                }
                case 'c'->{
                    System.out.print("Digite a temperatura: ");
                    temp = ler.nextFloat();
                    
                    tempFinal = (float)(5*(temp-32))/9;
                    System.out.println("\nSua temperatura em Farenheit = "+tempFinal);
                }
                default->{
                    System.out.println("\nOpção incorreta!\n");
                }
            }
        }while(opcao!='f' && opcao!='c');
    }
}
