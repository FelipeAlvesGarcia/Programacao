package Aula03;

import java.util.Scanner;

public class Aula03Atividade08 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double num1, num2, result;
        
        System.out.println("Primeiro número: ");
        num1 = ler.nextDouble();
        System.out.println("Operador: ");
        char operador = ler.next().charAt(0);
        System.out.println("Segundo número: ");
        num2 = ler.nextDouble();
        
        switch (operador){
            case '-'->{
                result = num1 - num2;
                System.out.println("\n= "+result);
            }
            case '+'->{
                result = num1 + num2;
                System.out.println("\n= "+result);
            }
            case '*'->{
                result = num1 * num2;
                System.out.println("\n= "+result);
            }
            case '/'->{
                if(num2==0)
                    System.out.println("\nDivisor = 0, ERRO!");
                else{
                    result = num1 / num2;
                    System.out.println("\n= "+result);    
                }
                
            }
            default->System.out.println("\nERRO!");
        }
    }
}
