package Aula07;

import java.util.Scanner;

public class Aula07Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        boolean primo;
        System.out.print("Numeros primos até 1000: ");
        for(int i=1; i<=1000; i++){
            primo = primo(i);
            if(primo == true)
                System.out.print(i+" ");
        }
    }
    public static boolean primo(int num){
        boolean primo = true;
        for(int i=num-1; i>1; i--){
            if((num%i)==0)
                primo=false;
        }
        return primo;
    }
}
