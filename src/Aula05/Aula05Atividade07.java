package Aula05;

import java.util.Scanner;

public class Aula05Atividade07 {
    public static void main(String[] args){
        float media=0;
        int i, aprovados=0;
        float[] notas = new float[10];
        Scanner ler = new Scanner(System.in);
        
        for (i=0;i<notas.length;i++){
            System.out.print("Digite a nota do "+(i+1)+"º aluno: ");
            notas[i] = ler.nextFloat();
            if(notas[i] >= 6)
                aprovados++;
            media += notas[i];
        }
        media = media/notas.length;
        System.out.println("\nAprovados: "+aprovados);        
        System.out.println("Média da turma: "+media);
    }
}
