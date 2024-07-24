package Aula07;

import java.util.Random;

public class Aula07Atividade03 {
    public static void main(String[] args){
        int num = dado();
        System.out.println(num);
    }
    
    public static int dado(){
        Random ale = new Random();
        return ale.nextInt(1, 7);
    }
}