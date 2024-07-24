package Aula03;

import java.util.Scanner;

public class Aula03Atividade15 {
    public static void main(String[] args){
        int i;
        float temp;
        float[] nums = new float[3];
        Scanner ler = new Scanner(System.in);
        
        int n, m;
        for(n=0; n<3; n++){
            System.out.print("Digite o "+(n+1)+"º número: ");
            nums[n] = ler.nextFloat();
        }
        System.out.print("Digite ou 1, ou 2 ou 3: ");
        i = ler.nextInt();
        
        switch (i){
            case 1->{
                for(n=0; n<3; n++){
                    for(m=n+1; m<3; m++){
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
            case 2->{
                for(n=0; n<3; n++){
                    for(m=n+1; m<3; m++){
                        if(nums[n]<nums[m]){
                            temp = nums[n];
                            nums[n] = nums[m];
                            nums[m] = temp;
                        }
                    }
                }
                for(n=0; n<3; n++)
                    System.out.print(nums[n]+" ");
            }
            case 3->{
                for(n=0; n<3; n++)
                    System.out.print((nums[n]*2)+" ");
            }
            default->System.out.println("Valor Inválido!");
        }
    }
}