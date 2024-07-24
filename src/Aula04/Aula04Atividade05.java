package Aula04;

import java.util.Scanner;

public class Aula04Atividade05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float nota, total=0, media;
        int i;
        
        for(i=1;i<=2;i++){
            for(nota=-1;nota<0 || nota>10;){
                System.out.print("Digite a nota da "+i+"º nota: ");
                nota = ler.nextFloat();
            }
            total += nota;
        }
        media = total /2;
        System.out.println("\nSua média é: "+media);
    }
}
