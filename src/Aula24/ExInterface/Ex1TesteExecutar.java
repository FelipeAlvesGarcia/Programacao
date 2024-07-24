package Aula24.ExInterface;

public class Ex1TesteExecutar {
    public static void main(String[] args){
        Ex1Teste vetor = new Ex1Teste();
        vetor.vetor();
        vetor.adiciona("Ana");
        vetor.adiciona("Baiano");
        vetor.remove();
        vetor.mostrar();
        
        Ex1 l1 = new Ex1Teste();
        //Para criar uma instância de uma interface, eu preciso
        //usar o construtor de uma classe que a implemente
        l1.adiciona("oi");
        l1.remove();
        //Este metodo só existe em Ex1Teste, então não está disponível
    }
}
