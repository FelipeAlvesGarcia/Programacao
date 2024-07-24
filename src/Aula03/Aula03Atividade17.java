package Aula03;

import java.util.Scanner;

public class Aula03Atividade17 {
    public static void main(String[] args){
        float[] nums = new float[3];
        int n, m;
        float temp;
        Scanner ler = new Scanner(System.in);
        
        for(n=0; n<3; n++){
            System.out.print("Digite o "+(n+1)+"º numero: ");
            nums[n] = ler.nextInt();
        }
        for(n=0; n<3; n++){
            for (m=n+1; m<3; m++){
                if(nums[n]>nums[m]){
                    temp = nums[n];
                    nums[n] = nums[m];
                    nums[m] = temp;
                }
            }
        }
        for(n=0; n<3; n++)
            System.out.print(nums[n]+" ");
    }
}