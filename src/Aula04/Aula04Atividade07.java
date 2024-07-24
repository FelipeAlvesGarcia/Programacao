package Aula04;

import java.util.Scanner;

public class Aula04Atividade07 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int tentativas, senha=0, senhaDefinida=12345;
        
        for(tentativas=0; senha!=senhaDefinida; tentativas++){
            System.out.print("Digite a senha: ");
            senha = ler.nextInt();
        }
        System.out.println("\nTentativas Incorretas: "+(tentativas-1));
    }
}