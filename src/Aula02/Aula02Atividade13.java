package Aula02;

import java.util.Scanner;

public class Aula02Atividade13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float altura, comprimento, largura, areaTotal, areaJanelas=0, areaPortas=0;
                
        System.out.print("\nEm relação à sua cozinha, digite as seguintes medidas:\n\t- Altura: ");
        altura = ler.nextFloat();
        System.out.print("\t- Comprimento: ");
        comprimento = ler.nextFloat();
        System.out.print("\t- Largura: ");
        largura = ler.nextFloat();
        
        areaTotal = (2*(comprimento*altura))+(2*(largura*altura));
        
        int i, janelas, portas;
        System.out.print("\nDigite o número de janelas que tem em sua cozinha: ");
        janelas = ler.nextInt();
        System.out.print("\nDigite o número de portas que tem em sua cozinha: ");
        portas = ler.nextInt();
        for(i=1; i<=janelas; i++){
            System.out.print("\nNa sua "+i+"º janela, digite as seguintes medidas: \n\t- Altura: ");
            altura = ler.nextFloat();
            System.out.print("\t- Largura: ");
            largura = ler.nextFloat();
            areaJanelas += (altura*largura);
        }
        for(i=1; i<=portas; i++){
            System.out.print("\nNa sua "+i+"º porta, digite as seguintes medidas: \n\t- Altura: ");
            altura = ler.nextFloat();
            System.out.print("\t- Largura: ");
            largura = ler.nextFloat();
            areaPortas += (altura*largura);
        }
        
        areaTotal = areaTotal - areaJanelas - areaPortas;
        float azulejos = (float)1.5;
        for(i=1; azulejos<areaTotal; i++){
            azulejos = (float)1.5;
            azulejos = azulejos*i;
        }
        float caixas = i-1;
        System.out.println("\nÁrea Total de azulejos: "+areaTotal+"m^2");
        System.out.println("Número de caixas de zulejo: "+caixas+" unidades\n");
    }
}