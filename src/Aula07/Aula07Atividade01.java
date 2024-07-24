package Aula07;

import java.util.Scanner;

public class Aula07Atividade01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float[] x = new float[2];
        boolean resposta = true;
        System.out.println("ax²+bx+c=0");
        System.out.print(" - Digite o valor de 'a': ");
        int a = ler.nextInt();
        System.out.print(" - Digite o valor de 'b': ");
        int b = ler.nextInt();
        System.out.print(" - Digite o valor de 'c': ");
        int c = ler.nextInt();
        x = equacao(a, b, c, resposta);
        System.out.printf("\nx' = %.2f\n",x[0]);
        System.out.printf("x'' = %.2f\n",x[1]);
    }
    
    public static float[] equacao(int a, int b, int c, boolean resposta){
        float[] x = {0, 0};
        float delta = (float)(b*b)-(4*a*c);
        if(delta<0){
            resposta = false;
            return x;
        }
        else{
            x[0] = (-b+(float)Math.sqrt(delta))/(2*a);
            x[1] = (-b-(float)Math.sqrt(delta))/(2*a);
            resposta = true;
            return x;
        }
    }
}
