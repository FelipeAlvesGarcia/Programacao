package Aula08;

import java.util.Scanner;

public class CifraCesar {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\t\t---CIFRA DE CÉSAR---\n");
        System.out.print("Digite a frase a ser criptografada: ");
        String frase = ler.nextLine().toUpperCase();
        System.out.print("\nDigite quantas posições será deslocado o alfabeto: ");
        int posicao = ler.nextInt();
        
        System.out.print("\nResultado da Criptografia: ");
        for(int i=0; i<frase.length(); i++){
            int num = (int)frase.charAt(i);
            if (num>=65){
                num += posicao;
                if(num>90)
                    num-=26;
                System.out.print((char) num);
            }
            else
                System.out.print(frase.charAt(i));
        }
        System.out.println("\n");
    }
}