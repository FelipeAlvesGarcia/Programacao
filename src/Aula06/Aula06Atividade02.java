package Aula06;

public class Aula06Atividade02 {
    public static void main(String[] args){
        int[][] matriz = new int[5][5];
        int i, n;
        
        for(i=0;i<matriz.length;i++){
            for(n=0;n<matriz[0].length;n++){
                if(i==n)
                    matriz[i][n] = 1;
                System.out.print(matriz[i][n]+" ");
            }
            System.out.println();
        }
    }
}