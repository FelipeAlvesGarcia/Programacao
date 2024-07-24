package Aula21.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args){
        String caminho = "/home/felipe/texto.txt";
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(caminho));
            String texto = "";
            String linha = "";
            while(linha!=null){
                linha = arquivo.readLine();
                if(linha!=null){
                    texto+=linha+"\n";
                }
            }
            System.out.println(texto);
            
        }
        catch(IOException erro){
            System.out.print("erro");
        }
    }
}