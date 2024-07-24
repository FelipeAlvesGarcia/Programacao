package Aula13.Lampada;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    String local;
    boolean estado = false;
    void ligar(){
        estado = true;
    }
    void desligar(){
        estado = false;
    }
    boolean estaLigada(){
        return estado;
    }
        String informacoes (){
        String info = "INFORMAÇÕES:\n";
        info += String.format(" - Marca = "+marca+"\n");
        info += String.format(" - Modelo = "+modelo+"\n");
        info += String.format(" - Cor = "+cor+"\n");
        info += String.format(" - Local = "+local+"\n");
        return info;
    }
}
