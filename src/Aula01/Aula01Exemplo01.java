package Aula01;

public class Aula01Exemplo01 {
    public static void main(String[] args){
        System.out.print("Hello World!");
        System.out.println("Hello World!");
        System.out.printf("Hello World!\n");
        
        String nome = "Felipe";
        String sobrenome = "Garcia";
        int altura = 184;
        float alturaF = (float)1.84;
        float alturaF2 = 1.84f;

        System.out.println("Nome: "+nome+" "+sobrenome);
        System.out.printf("Nome: %s %s\n", nome, sobrenome);
        
        System.out.println("Altura: "+altura+"cm\nAltura: "+alturaF2+"m");
        System.out.printf("Altura: %.2fm\nAltura: %dcm\n", alturaF2, altura);
    }
}
