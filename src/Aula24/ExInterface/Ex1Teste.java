package Aula24.ExInterface;

public class Ex1Teste implements Ex1{
    private String[] elementos;
    private int tamanho;
    
    public void vetor(){
        tamanho = 0;
        elementos = new String[10];
    }
    
    @Override
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }
    
    @Override
    public void remove(){
        if(tamanho > 0){
            tamanho--;
        }
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void mostrar(){
        String mostra = "[ ";
        if(tamanho>0){
            for(int i = 0; i<tamanho; i++){
                mostra += String.format("%s ",elementos[i]);
            }    
        }
        mostra += String.format("]");
        System.out.println(mostra);
    }
}
