package Aula07;

import java.util.Scanner;

public class Aula07Exemplo01 {
    //item global = propriedade  de método;
    public static int soma (int v1, int v2){
        int adicao = v1 + v2;
        return adicao;
    }//Pode ter métodos com mesmo nome, mas precisam ter parâmetros diferentes;
    
    public static String ver(int[][] matriz){
        String retorno = "";
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz[0].length; c++){
                retorno += String.format("%d ", matriz[l][c]);
            }
        }
        return retorno;
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int v1 = 1, v2 = 2;
        int total;
        total = soma(v1,v2);
        System.out.println(v1+" + "+v2+" = "+total);
        
        //String impresao = ver(matriz);
        //S.o.pf("%s", impressao);
    }
}
