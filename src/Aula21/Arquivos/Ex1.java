package Aula21.Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex1 {
    public static void main(String[] args){
        String caminho = "/home/felipe/texto.txt";
        try{
            BufferedWriter arquivo = new BufferedWriter(new FileWriter(caminho));
            for(int i = 0; i<10; i++){
                arquivo.append("Linha "+i+" do arquivo\n");
            }
            arquivo.close();
        }
        catch(Exception erro){
            System.out.println("Erro!");
        }
    }
}
